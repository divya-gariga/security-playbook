package com.example.helloworld.controller;

import com.example.helloworld.entity.User;
import com.example.helloworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
public class GreetingController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index() {
        return "<h1>Hello World!<h1>";
    }
    @GetMapping("/auth")
    public List<User> auth(@RequestParam String user, @RequestParam String password) {
        return userService.auth(user,password);
    }
}