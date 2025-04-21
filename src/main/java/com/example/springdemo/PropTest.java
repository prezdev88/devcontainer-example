package com.example.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class PropTest {

    @Value("${spring.kafka.bootstrap-servers:CACA}")
    private String bootstrapServers;

    @PostConstruct
    public void init() {
        System.out.println("Bootstrap servers: " + bootstrapServers);
    }    
}
