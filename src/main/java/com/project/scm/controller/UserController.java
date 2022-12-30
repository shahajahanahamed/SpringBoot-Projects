package com.project.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class UserController {
    @GetMapping({"/", "/home"})
    public String home(Model model){
        model.addAttribute("title","Home:Smart Contact Manager");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("title","About:Smart Contact Manager");
        return "about";
    }

    @GetMapping("/sign-in")
    public String signin(Model model){
        model.addAttribute("title","Sign In:Smart Contact Manager");
        return "signin";
    }

    @GetMapping("/sign-up")
    public String signup(Model model){
        model.addAttribute("title","Sign Up:Smart Contact Manager");
        return "signup";
    }
}
