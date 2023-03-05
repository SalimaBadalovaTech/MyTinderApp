package com.example.newtinderproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
public class AccountController {

    @GetMapping(value = "/my-profile")
    public String getProfilePage(Principal principal, ModelMap modelMap) {
        modelMap.put("name",principal.getName());
        return "my-profile";
    }

    @GetMapping(value = "/favourites")
    public String goToFavorites(Principal principal, ModelMap modelMap) {
        modelMap.put("name",principal.getName());
        return "favourites";
    }


}
