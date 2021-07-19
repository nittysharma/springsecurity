package com.itlifter.learn.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/login")
    public String login(){
        return "login.html";
    }
    @GetMapping("/register")
    public String register(){
        return "register";
    }
}
