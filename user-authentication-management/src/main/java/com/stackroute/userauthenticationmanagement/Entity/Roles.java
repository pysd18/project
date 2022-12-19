package com.stackroute.userauthenticationmanagement.Entity;

import java.util.ArrayList;
import java.util.List;

public class Roles {
    List<String> roles;

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> rolesList) {
        this.roles = new ArrayList<>();
        for (String role : rolesList
        ) {
            roles.add(role);
        }
    }
}
