package com.rayen.useraaa.service;

import com.rayen.useraaa.entities.Role;
import com.rayen.useraaa.entities.User;
import com.rayen.useraaa.service.register.RegistationRequest;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
    List<User>findAllUsers();
    User registerUser(RegistationRequest request);
    void sendEmailUser(User u, String code);
    public User validateToken(String code);


}
