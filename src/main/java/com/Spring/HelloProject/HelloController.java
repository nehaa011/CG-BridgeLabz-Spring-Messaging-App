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
     //@GetMapping
     //public String sayHello(@RequestParam String name){
     //   return "Hello, " + name + " from BridgeLabz";
     //}


    //UC3: GET request with a path variable
    //@GetMapping("/{name}")
    //public String sayHello(@PathVariable String name){
    //    return "Hello, " + name + " from BridgeLabz";
    //}


    //UC4: Use POST Request and pass first name and last name in the Body
    @PostMapping("/greet")
    public String sayHello(@RequestBody HelloDTO user){
        return "Hello, " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }


}
