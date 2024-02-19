package com.spring.controller;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @GetMapping("/")
    public String helloWorld()
    {
        return "Welcome to SpringBoot Anusha";
    }
}
