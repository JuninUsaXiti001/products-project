package com.project.protection.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoggedController {

    @GetMapping("/")
    public String logged() {
        return "html/private/logged";
    }
}
