package com.example.helloworld.repository;

import com.example.helloworld.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    @Query("SELECT u FROM User u WHERE u.name = :name AND u.password = :password")
    List<User> findByNameAndPassword(@Param("name") String name, @Param("password") String password);
}
