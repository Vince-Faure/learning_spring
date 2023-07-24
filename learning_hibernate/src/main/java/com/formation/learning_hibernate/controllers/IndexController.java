package com.formation.learning_hibernate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title","Learning Hibernate");
        return "page.html";
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact/form.html";
     }
    @PostMapping("/contact")
    public String contactSend( 
        @RequestParam String name,
        @RequestParam String email, 
        @RequestParam String message) {
       
          
        System.out.println(name);
        System.out.println(email);
        System.out.println(message);

        return "contact/form.html";
     }
    }