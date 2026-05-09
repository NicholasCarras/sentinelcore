package com.nick.sentinelcore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Lets Spring Boot know this class is for APIs
public class HealthController {

    // Creates endpoint

    @GetMapping("/health")
    public String health() {
        return "SentinelCore system is running";
    }

}