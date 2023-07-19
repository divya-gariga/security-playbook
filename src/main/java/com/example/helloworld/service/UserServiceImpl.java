package com.example.helloworld.service;

import com.example.helloworld.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public void registerUser(User user) {
        User user1 = new User();
        user1.setEmail(user.getEmail());
        user1.setPassword(passwordEncoder.encode(user.getPassword()));
        log.debug("encoded password");
        System.out.println("password "+user.getPassword());
        System.out.println("encoded password "+user1.getPassword());
    }
}
