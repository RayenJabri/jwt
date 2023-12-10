package com.rayen.useraaa;

import com.rayen.useraaa.entities.Role;
import com.rayen.useraaa.entities.User;
import com.rayen.useraaa.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class UserAaaApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserAaaApplication.class, args);
    }
    @Autowired
    UserService userService;

    /*@PostConstruct
     void init_users() {
 //ajouter les rôles
         userService.addRole(new Role(null,"ADMIN"));
       userService.addRole(new Role(null,"USER"));
 //ajouter les users
         userService.saveUser(new User(null,"admin","123",true,null));
         userService.saveUser(new User(null,"rayen","123",true,null));
         userService.saveUser(new User(null,"rayen1","123",true,null));
 //ajouter les rôles aux users
         userService.addRoleToUser("admin", "ADMIN");
         userService.addRoleToUser("admin", "USER");
         userService.addRoleToUser("rayen", "USER");
         userService.addRoleToUser("rayen1", "USER");
     }*/
    @Bean
    BCryptPasswordEncoder getBCE() {
        return new BCryptPasswordEncoder();
    }
}
