package com.project.scm.controller;

import com.project.scm.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        model.addAttribute("user",new User());
        return "signup";
    }

    @PostMapping("/do-register")
    public String doRegister(@ModelAttribute("user") User user, @RequestParam(value = "agreement", defaultValue = "false") boolean agreement, Model model){
        if(!agreement){
            System.out.println("Terms and Conditions are not accepeted");
        }

        model.addAttribute("user",user);
        return "signup";
    }
}
