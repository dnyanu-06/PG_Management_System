package com.project.pgmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register-owner")
    public String registerOwner() {
        return "owner_register";
    }

    @GetMapping("/register-guest")
    public String registerGuest() {
        return "guest_register";
    }

}
