package com.example.portfoliosomesh;

import com.example.portfoliosomesh.Entity.User;
import com.example.portfoliosomesh.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String home(){
        return "Hello from Somesh Java APP :))";
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userRepository.findAll();
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
