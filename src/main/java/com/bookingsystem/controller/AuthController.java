package com.bookingsystem.controller;

import com.bookingsystem.model.User;
import com.bookingsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register (@RequestBody User user) {
        return userService.register(user);
    }
}
