package com.example.test.Controller;

import org.springframework.web.bind.annotation.*;
import com.example.test.dto.UserDTO;

@RestController
@RequestMapping("/hello")
public class HelloTestController {

    // GET Request
    // http://localhost:8080/hello (Hello from BridgeLabz)
    @GetMapping
    public String getHelloMessage() {
        return "Hello from BridgeLabz";
    }

    // GET Request with Query Parameter
    //http://localhost:8080/hello/query?name=Abhishek (Hello Abhishek from BridgeLabz)
    @GetMapping("/query")
    public String getPersonalizedHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // GET Request with Params as a Path
    // http://localhost:8080/hello/params/Abhishek (Hello Abhishek from BridgeLabz)
    @GetMapping("/params/{name}")
    public String sayHelloPathVariable(@PathVariable String name){
        return "Hello " + name+" from Bridgelabz";
    }

    // Post Request
    // http://localhost:8080/hello/post (Hello Abhishek Baghel from BridgeLabz)
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody UserDTO user){
        return "Hello " + user.getFirstName()+" "+user.getLastName()+" from Bridgelabz";
    }

    // PUT request with query parameter and params as path
    // http://localhost:8080/hello/put/Abhishek?lastName=Baghel (Hello Abhishek Baghel from BridgeLabz)
    @PutMapping("/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}


