package com.fashion.sizerecommendation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String hello() {
        return "Fashion Size Recommendation API is running! 🎉";
    }
    
    @GetMapping("/test")
    public String test() {
        return "Test endpoint works!";
    }
}