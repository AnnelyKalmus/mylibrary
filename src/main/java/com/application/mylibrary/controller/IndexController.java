package com.application.mylibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {

    @GetMapping("/")
    public String showHome() {
        return "index";
    }

}
