package com.formation.learning_hibernate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import com.formation.learning_hibernate.entities.ContactEntity;

import jakarta.validation.Valid;



@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title","Learning Hibernate");
        return "page.html";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("contact",new ContactEntity());        
        return "contact/form.html";
     }

    @PostMapping("/contact")
    public String contactSend(
        @Valid @ModelAttribute(name="contact") ContactEntity contact,
        BindingResult contactBinding,
        Model model
        ) {
        if(contactBinding.hasErrors()){
            model.addAttribute("contact ", contact);
            return "contact/form.html";
        }
        return "redirect:/";
     }
    }