package com.example.newtinderproject.services.impl;

import com.example.newtinderproject.dto.RegistrationDto;
import com.example.newtinderproject.services.ValidationService;
import org.springframework.stereotype.Service;

@Service
public class ValidationServiceImpl implements ValidationService {
    private UserServiceImpl userService;

    public ValidationServiceImpl(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public String validateUser(RegistrationDto user) {
        if (userService.findByEmail(user.getEmail())==null){
            return "User with this email already exists! Login with another mail";
        }
        return "";
    }
}
