package com.example.newtinderproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {

    @GetMapping(value = "/registration")
    public String goToRegistration(){
        return "registration";
    }
}
