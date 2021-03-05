package com.example.fuckMyProject.service;

import com.example.fuckMyProject.model.Users;
import com.example.fuckMyProject.controller.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    Users findByEmail(String email);

    Users save(UserRegistrationDto registration);
}
