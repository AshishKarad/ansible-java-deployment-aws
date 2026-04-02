package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Java application is running successfully!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy";
    }
}
