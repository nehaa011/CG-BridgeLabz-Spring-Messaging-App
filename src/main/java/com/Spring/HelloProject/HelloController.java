package com.Spring.HelloProject;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // UC1: Handle GET Request to return a Hello message
    //@GetMapping
    // public String sayHello(){
    //     return "Hello from BridgeLabz";
    // }


     //UC2: GET request with a query parameter
     @GetMapping
     public String sayHello(@RequestParam String name){
        return "Hello, " + name + " from BridgeLabz";
     }



}
