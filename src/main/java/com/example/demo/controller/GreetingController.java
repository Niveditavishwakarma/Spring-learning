package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @GetMapping("/message")
    public String showGreeting() {
        return "Hello from BridgeLabz - Greeting Controller";
    }
}
