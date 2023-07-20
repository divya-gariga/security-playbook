package com.example.helloworld.service;

import com.example.helloworld.entity.User;

import java.util.List;

public interface UserService {
    List<User> auth(String user, String password);
}
