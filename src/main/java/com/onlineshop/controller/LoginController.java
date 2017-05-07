package com.onlineshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by smc on 5/7/2017.
 */

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error , @RequestParam(value = "logout", required = false ) String logout, Model model){
        if (error != null){
            model.addAttribute("error", "Invalid username and password");
        }

        if (logout != null){
            model.addAttribute("logout", "Logged out");
        }

        return "login";
    }
}
