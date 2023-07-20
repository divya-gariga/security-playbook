package com.example.helloworld.service;

import com.example.helloworld.entity.User;
import com.example.helloworld.repository.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<User> auth(String user, String password) {
        String jql = "Select u from User u where name = '" + user + "' and password='"+password+"'";
        TypedQuery<User> result = entityManager.createQuery(jql, User.class);
        List<User> users = result.getResultList();
        return users;
    }
}
