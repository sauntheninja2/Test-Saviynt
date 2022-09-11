package com.IAM.TestSaviynt.Repository;


import com.IAM.TestSaviynt.models.Connections;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.jmx.export.naming.IdentityNamingStrategy;

public interface ConnectionsRepository extends JpaRepository<Connections, Long>{

}
