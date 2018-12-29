package com.freelancoz.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("freelancoz")
public class HomePageController {

    @GetMapping("/")
    public String hompage(){
        return "home";
    }
}