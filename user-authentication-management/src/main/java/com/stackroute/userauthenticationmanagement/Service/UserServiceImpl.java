package com.stackroute.userauthenticationmanagement.Service;

import com.stackroute.userauthenticationmanagement.Dao.UserRepositary;
import com.stackroute.userauthenticationmanagement.Entity.Users;
import com.stackroute.userauthenticationmanagement.dto.SignupDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.springframework.util.ClassUtils.isPresent;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepositary userRepositary;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public Users updateUser(String id) {
        return null;
    }


    @Override
    public String addNewUsers(SignupDto userDetails) {

        // Check from DB -> if there's any user wiuth admin role.
//        If yes, DENY THIS REQUEST
        // If no, proceed with registration
        //Users userAlreadyRegister = userRepositary.findByEmail(userDetails.getEmail());
//        if (!(userAlreadyRegister == null)) {
//            throw new UsernameNotFoundException("User already registered");
//        }


        //    Optional<Users> optionalUsers= Optional.ofNullable(this.userRepositary.findByEmail(userDetails.getEmail()));


        var user = new Users();
        Users userAlreadyRegister = this.userRepositary.findByEmail(userDetails.getEmail());
        if (!(userAlreadyRegister == null)) {
            user.setUserName(userDetails.getUserName());
            user.setEmail(userDetails.getEmail());
            user.setRoles(userDetails.getRoles());
            user.setPhoneNumber(userDetails.getPhoneNumber());
            user.setPassword(passwordEncoder.encode(userDetails.getPassword()));


            userRepositary.save(user);
            return "user registered successsfully";
        } else {
            throw new UsernameNotFoundException("user name not found");
        }
       // return "user registered successfully";
    }

    public Users UpdateUsers(Users user){
     //   Optional<Users> optionalUsers= this.userRepositary.findById(users.getEmail());
     Users userExists =this.userRepositary.findByEmail(user.getEmail());
     if(userExists==null){
         throw new UsernameNotFoundException("user not found to update");
     }
        userExists.setUserName(user.getUserName());
       userExists.setPassword(user.getPassword());
       userExists.setPhoneNumber(user.getPhoneNumber());
       userRepositary.save(user);
       return user;

    }
    public String findUser(){
       // String str  =this.userRepositary.findByEmail(email.getEmail());
       return "welcome";
    }
}
