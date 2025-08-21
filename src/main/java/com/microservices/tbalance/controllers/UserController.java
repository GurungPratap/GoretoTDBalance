package com.microservices.tbalance.controllers;

import com.microservices.tbalance.response.LoginResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/login")
    public LoginResponse login(){
        return  null;
    }
    @GetMapping("/test")
    public String testApi(){
        return  "Hello Welcome to the TBalance";
    }
}
