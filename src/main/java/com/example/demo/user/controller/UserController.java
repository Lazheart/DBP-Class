package com.example.demo.user.controller;

import com.example.demo.user.domain.User;
import com.example.demo.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/username/{username}")
    public String getUserByUsername(String username) {
        return "User: " + username;
    };

    @GetMapping("/email/{email}")
    public String getUserByEmail(String email) {
        return "User: " + email;
    }

    @GetMapping("/id/{id}")
    public String getUserById(Long id) {
        return "User: " + id;
    }

    @GetMapping("/age/{age}")
    public Page<User> getUserByAge(
            @PathVariable Integer age,
            @PageableDefault(page = 0, size = 10) Pageable pageable
    ) {
        return userService.getUserByAge(age, pageable);
    }
}
