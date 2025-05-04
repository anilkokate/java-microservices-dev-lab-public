package com.sia.patterns.command_pattern_poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/command")
public class OrderController {

    @RequestMapping("/order")
    @GetMapping
    public String order() {
        return "Order placed successfully!";
    }

}
