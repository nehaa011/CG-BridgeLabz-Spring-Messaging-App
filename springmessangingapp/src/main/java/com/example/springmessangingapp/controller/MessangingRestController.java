package com.example.springmessangingapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")

public class MessangingRestController {
    @GetMapping   //get request to print message
    public String hello() {
        return "Hello from BridgeLabz";
    }

}
