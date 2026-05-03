package com.example.welcome.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping(value = "/welcome", produces = "application/json")
    public String welcome(){

        return "Welcome from Spring Boot on Google Cloud";
    }
}
