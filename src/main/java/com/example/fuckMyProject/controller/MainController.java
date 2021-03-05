package com.example.fuckMyProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

//    @GetMapping("/")
//    public String root() {
//        return "index";
//    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "index";
    }

//    @RequestMapping(value = { "/", "/login" })
//    public String login(@RequestParam(required = false) String message, final Model model) {
//        if (message != null && !message.isEmpty()) {
//            if (message.equals("logout")) {
//                model.addAttribute("message", "Logout!");
//            }
//            if (message.equals("error")) {
//                model.addAttribute("message", "Hey bro,Login Failed!");
//            }
//        }
//        return "login";
//    }
    @RequestMapping("/403")
    public String accessDenied() {
        return "403";
    }
}
