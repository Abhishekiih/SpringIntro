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
}
