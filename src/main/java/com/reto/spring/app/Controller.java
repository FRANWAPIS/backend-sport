package com.reto.spring.app; 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/status")
    public String getStatus() {
        return "{\"status\": \"UP\", \"version\": \"1.0.0\"}";
    }
}