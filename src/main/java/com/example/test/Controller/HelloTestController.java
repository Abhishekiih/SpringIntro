package com.example.test.Controller;

import org.springframework.web.bind.annotation.*;

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
}
