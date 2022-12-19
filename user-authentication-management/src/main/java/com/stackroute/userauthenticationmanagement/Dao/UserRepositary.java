package com.stackroute.userauthenticationmanagement.Dao;

import com.stackroute.userauthenticationmanagement.Entity.Users;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepositary extends MongoRepository<Users, String> {
//public Users findbyUsername(Users Username);

    @Query("SELECT u FROM User u WHERE u.email = ?1")
public Users findByEmail(String email);

    //Users  findByUsername(String username);

    //Optional<Object> findByUsername(String username);

    //Users save(Users user);
}
