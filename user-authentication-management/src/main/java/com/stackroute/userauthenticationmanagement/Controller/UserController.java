package com.stackroute.userauthenticationmanagement.Controller;

import com.stackroute.userauthenticationmanagement.Entity.Users;
import com.stackroute.userauthenticationmanagement.Service.UserService;
import com.stackroute.userauthenticationmanagement.dto.SignupDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;



    @PostMapping("/signup")
    public String addNewUser(@RequestBody SignupDto userDetails){

       return userService.addNewUsers(userDetails);
    }

    @PostMapping("/test")
    public String addNewUserTest(@RequestBody SignupDto userDetails){

        return userService.addNewUsers(userDetails);
    }
    @GetMapping("/welcome")
    public String findUser(){
        return this.userService.findUser();
    }

}
