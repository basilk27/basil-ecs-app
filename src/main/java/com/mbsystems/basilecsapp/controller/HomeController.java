package com.mbsystems.basilecsapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HomeController {

    @GetMapping(path = "/home")
    public String home() {
        return "Basil running in AWS ECS";
    }
}
