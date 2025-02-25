package com.Spring.HelloProject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // UC1: Handle GET Request to return a Hello message
    @GetMapping
    public String sayHello(){
        return "Hello from BridgeLabz";
    }

}
