package com.kafka.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kafka.demo.models.Message;

@Controller
public class MainController {
    
    @GetMapping(value = "/input")
    public String messageInputForm(Model model) {
        model.addAttribute("message", new Message());
        return "input";
    }
}
