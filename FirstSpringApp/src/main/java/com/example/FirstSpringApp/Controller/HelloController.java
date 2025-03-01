package com.example.FirstSpringApp.Controller;

import com.example.FirstSpringApp.Model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Marks this class as a REST Controller
@RequestMapping("/api")  // Base URL for all endpoints
public class HelloController {

    @GetMapping("/hello")
    public Message sayHello() {
        return new Message("Hello from BridgeLabz");
    }
}
