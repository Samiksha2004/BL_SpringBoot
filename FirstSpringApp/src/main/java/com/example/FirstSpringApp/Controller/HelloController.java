package com.example.FirstSpringApp.Controller;

import com.example.FirstSpringApp.Model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("message", new Message("Hello from BridgeLabz"));
        return "hello";  // Must match hello.html in templates/
    }
}

