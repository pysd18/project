package com.stackroute.userauthenticationmanagement.Configuration;

import com.stackroute.userauthenticationmanagement.Entity.Users;
//import com.stackroute.userauthenticationmanagement.Service.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class WebSecurityConfig{

//    @Override
//protected void configure(HttpSecurity http) throws Exception {
//http.authorizeRequests()
//.antMatchers("/users").authenticated()
//.anyRequest().permitAll()
//.and()
//.formLogin()
//.permitAll()
//.and()
//.logout().logoutSuccessUrl("/signup").permitAll();
//}


//        public void configure(HttpSecurity http) throws Exception {
//            http
//                    .csrf().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic();
//        }

//private UserDetailsImpl userDetails;
        @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
            http.authorizeRequests((authz) -> authz.anyRequest().authenticated()).httpBasic(withDefaults());
            return http.build();
        }

        @Bean
        public WebSecurityCustomizer webSecurityCustomizer() {
            return (web) -> web.ignoring().antMatchers("/signup", "/testy");
        }
    @Bean
    AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }
  //  @Autowired
  //  private DataSource dataSource;

//    @Bean
//    public DaoAuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//
//        authProvider.setUserDetailsService(Users.get(Username));
//        authProvider.setPasswordEncoder(passwordEncoder());
//
//        return authProvider;
//    }

//    @Bean
//    public UserDetailsManager authenticateUsers() {
//
//        UserDetails user = User.withUsername("username")
//                .password(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("password")).build();
//        JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
//        users.setAuthoritiesByUsernameQuery("select user_name,user_pwd,user_enabled from user where user_name=?");
//        users.setUsersByUsernameQuery("select user_name,user_role from user where user_name=?");
//        users.createUser(user);
//        return users;
//    }


//@Bean
//public DaoAuthenticationProvider authenticationProvider() {
//DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//authProvider.setUserDetailsService(userDetailsService());
//authProvider.setPasswordEncoder(passwordEncoder());
//
//return authProvider;
//}
}
//        @Bean
//        public PasswordEncoder passwordEncoder() {
//            return new BCryptPasswordEncoder();
//        }






