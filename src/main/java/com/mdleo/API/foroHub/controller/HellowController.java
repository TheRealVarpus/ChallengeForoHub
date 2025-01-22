package com.mdleo.API.foroHub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HellowController {
    @GetMapping
    public String helloWorld() {
        return "Hello World Spring!";
    }
}
