package com.example.springdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@RestController
@RequestMapping
public class RestTest {

    @GetMapping
    public UserResponse test() {
        log.info("wena!");
        return new UserResponse(1, "Patricio Pérez");
    }
    
}
