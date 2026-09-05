package com.example.demo.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {


    @GetMapping("/username/{username}")
    public String getUserByUsername(String username) {
        return "User: " + username;
    };

    
}
