package com.example.helloworld.controller;

import com.example.helloworld.util.SHAHashGenerator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class GreetingController {

    @GetMapping("/")
    public String index() {
        return "<h1>Hello World!<h1>";
    }
    @GetMapping("/hashing/{password}")
    public String hashPassword(@PathVariable String password) {
        String hashedPassword = SHAHashGenerator.generateSHA1Hash(password);
        return hashedPassword;
    }
}