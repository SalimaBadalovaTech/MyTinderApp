package com.example.newtinderproject.services;


import com.example.newtinderproject.dto.RegistrationDto;
import com.example.newtinderproject.model.UserEntity;

public interface CustomUserService {

    void saveUser(RegistrationDto registrationDto);

    UserEntity findByEmail(String email);
    UserEntity findByUsername(String username);
}
