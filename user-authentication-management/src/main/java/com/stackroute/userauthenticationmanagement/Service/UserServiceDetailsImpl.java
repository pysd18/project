//package com.stackroute.userauthenticationmanagement.Service;
//
//import com.stackroute.userauthenticationmanagement.Dao.UserRepositary;
//import com.stackroute.userauthenticationmanagement.Entity.Users;
//import com.stackroute.userauthenticationmanagement.exception.UsernameCustomException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//public class UserServiceDetailsImpl implements UserDetailsService {
//    @Autowired
//  public  UserRepositary userRepositary;
//    @Override
//   // public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        Users user = userRepositary.findByEmail(username);
//          if (user == null) {
//           throw new UsernameNotFoundException("User not found");
//}
//        //  if(user.getEmail())
//                return new UserDetailsImpl(user);
//    }
////            User user = userRepositary.findByUsername(username)
////                    .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
////
////            return UserDetailsImpl.build(user);
////        }
//
//
//
//}
