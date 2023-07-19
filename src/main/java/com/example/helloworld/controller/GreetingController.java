package com.example.helloworld.controller;

import com.example.helloworld.dto.User;
import com.example.helloworld.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class GreetingController {
    @Autowired
    public UserService userService;

    @GetMapping("/")
    public String index() {
        return "<h1>Hello World!<h1>";
    }

    @PostMapping("/register")
    public void registerUser(@RequestBody User user){
        userService.registerUser(user);
    }
}