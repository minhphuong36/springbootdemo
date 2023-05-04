package com.example.demo_spring_boot.security.service;

import com.example.demo_spring_boot.entities.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface UserService extends GeneralService<User> , UserDetailsService {
    Optional<User> findByUsername(String username);
}
