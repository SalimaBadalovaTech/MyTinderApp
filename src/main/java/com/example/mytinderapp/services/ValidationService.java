package com.example.newtinderproject.services;

import com.example.newtinderproject.dto.RegistrationDto;

public interface ValidationService {
    public String validateUser(RegistrationDto user);
}
