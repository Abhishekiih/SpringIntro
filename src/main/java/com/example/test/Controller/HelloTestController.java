package com.example.test.Controller;

import org.springframework.web.bind.annotation.*;
import com.example.test.dto.UserDTO;

@RestController
@RequestMapping("/hello")
public class HelloTestController {

    // GET Request
    @GetMapping
    public String getHelloMessage() {
        return "Hello from BridgeLabz";
    }

    // GET Request with Query Parameter
    @GetMapping("/query")
    public String getPersonalizedHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @GetMapping("/params/{name}")
    public String sayHelloPathVariable(@PathVariable String name){
        return "Hello " + name+" from Bridgelabz";
    }

    @PostMapping("/post")
    public String sayHelloPost(@RequestBody UserDTO user){
        return "Hello " + user.getFirstName()+" "+user.getLastName()+" from Bridgelabz";
    }
}


