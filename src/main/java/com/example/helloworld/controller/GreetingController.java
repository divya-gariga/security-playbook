package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class GreetingController {

    @GetMapping("/")
    public String index() {
        return "<h1>Hello World!<h1>";
    }
}