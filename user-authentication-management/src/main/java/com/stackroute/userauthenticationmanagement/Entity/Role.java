package com.stackroute.userauthenticationmanagement.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="roles")
public class Role {
    @Id
    private Integer id;
    private Erole role;


    public Erole getRole() {
        return role;
    }

    public void setRole(Erole role) {
        this.role = role;
    }
}