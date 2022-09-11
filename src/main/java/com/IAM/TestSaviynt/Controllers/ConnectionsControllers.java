package com.IAM.TestSaviynt.Controllers;


import com.IAM.TestSaviynt.Repository.ConnectionsRepository;
import com.IAM.TestSaviynt.models.Connections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/connections")
public class ConnectionsControllers {

    @Autowired
    private ConnectionsRepository connectionsRepository;

    @GetMapping
    public List<Connections> findAllConnections(){

        return connectionsRepository.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<Connections> findConnectionById(@PathVariable(value = "id") long id){

        Optional<Connections> connections = connectionsRepository.findById(id);

        if(connections.isPresent()){
            return ResponseEntity.ok().body(connections.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @PostMapping
    public Connections saveConnection(@Validated @RequestBody Connections connections){
        return connectionsRepository.save(connections);

    }
}
