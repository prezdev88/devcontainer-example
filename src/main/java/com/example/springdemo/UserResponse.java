package com.example.springdemo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserResponse {
    private int id;
    private String name;   
}
