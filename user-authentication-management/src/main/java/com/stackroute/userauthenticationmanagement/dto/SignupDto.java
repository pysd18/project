package com.stackroute.userauthenticationmanagement.dto;


//import com.stackroute.userauthenticationmanagement.Entity.Role;
import com.stackroute.userauthenticationmanagement.Entity.Roles;
import com.stackroute.userauthenticationmanagement.Entity.Users;
import lombok.Data;
import org.springframework.data.annotation.Id;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Data
public class SignupDto {
  private String userName;
  private String email;
  private String password;
  private long phoneNumber;
  private List<String> roles;

}
