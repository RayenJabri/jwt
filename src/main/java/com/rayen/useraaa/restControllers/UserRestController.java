package com.rayen.useraaa.restControllers;
import java.util.List;

import com.rayen.useraaa.entities.User;
import com.rayen.useraaa.service.UserService;
import com.rayen.useraaa.service.register.RegistationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class UserRestController {
    @Autowired
    UserService userService;
    @RequestMapping(path = "all", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }
    @PostMapping("/register")
    public User register(@RequestBody RegistationRequest request)
    {
        return userService.registerUser(request);
    }
    @GetMapping("/verifyEmail/{token}")
    public User verifyEmail(@PathVariable("token") String token){
        return userService.validateToken(token);
    }


}