package com.training.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.datas.repositories.UserRepository;

@RestController
public class HelloWorldController {

    private final UserRepository userRepository;

    public HelloWorldController(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public String sayHello() {
     return "Hello World";
    }
}
