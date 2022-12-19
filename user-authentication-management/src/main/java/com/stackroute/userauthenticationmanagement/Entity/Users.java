package com.stackroute.userauthenticationmanagement.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Document(collection = "users")
public class Users {
    @Id
    private String id;
    private String userName;
    private String email;
    private String password;
    private long phoneNumber;
    private Roles roles;

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        var listOfRoles = new Roles();
        listOfRoles.setRoles(roles);
        this.roles = listOfRoles;
    }

    //    @DBRef
//    private Set<String> roles = new HashSet<>();

//    public Set<String> getRoles() {
//        return roles;
//    }

//    public void setRoles(Set<String> roles) {
//        this.roles = roles;
//    }

    public Users() {
    }

//    public Users(String userName, String email, String password, long phoneNumber) {
//        this.userName = userName;
//        this.email = email;
//        this.password = password;
//        this.phoneNumber = phoneNumber;
//    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
