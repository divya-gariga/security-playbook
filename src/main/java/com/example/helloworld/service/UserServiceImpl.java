package com.example.helloworld.service;

import com.example.helloworld.entity.User;
import com.example.helloworld.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> auth(String user, String password) {
        return userRepository.findByNameAndPassword(user,password);
    }
}
