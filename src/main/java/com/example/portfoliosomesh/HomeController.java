package com.example.portfoliosomesh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Hello from Somesh Java APP :))";
    }

    @GetMapping("version")
    public String version() {
        return "Version: v2";
    }

    @GetMapping("/health")
    public String health(){
        return "OK";
    }
}
