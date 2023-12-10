package com.rayen.useraaa.service;

import com.rayen.useraaa.entities.Role;
import com.rayen.useraaa.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
    List<User>findAllUsers();
}
