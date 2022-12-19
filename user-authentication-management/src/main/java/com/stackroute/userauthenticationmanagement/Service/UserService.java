package com.stackroute.userauthenticationmanagement.Service;

import com.stackroute.userauthenticationmanagement.Entity.Users;
import com.stackroute.userauthenticationmanagement.dto.SignupDto;

public interface UserService {
    public Users updateUser(String id);
    public String addNewUsers(SignupDto userDetails);
    public String findUser();
}
