package com.IAM.TestSaviynt.models;

import org.springframework.core.style.ToStringCreator;

import javax.persistence.*;


@Entity
@Table(name = "savint_connections")
public class Connections  extends CreatedBy {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "Connection Name")
    private String connectionName;

    @Column(name = "Connection Type")
    private String connectionType;

    @Column(name = "URL")
    private String url;

    @Column(name = "AWS_ACCESS_KEY")
    private String access_key;

    @Column(name = "AWS_SECRET_KEY")
    private String secret_key;

    @Column(name = "DEFAULT_REGION")
    private String region;

    public String getAccess_key() {
        return access_key;
    }

    public void setAccess_key(String access_key) {
        this.access_key = access_key;
    }

    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }


    public Long getId(){
        return id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSecret_key() {
        return secret_key;
    }

    public void setSecret_key(String secret_key) {
        this.secret_key = secret_key;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

     /* @Override
    public String toString(){
        //TODO CLASS
    }


      */
}
