package com.onlineshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by smc on 5/1/2017.
 */

@Controller
@RequestMapping("/")
public class HomeController {



    @RequestMapping
    public String home() {
        return "home";
    }

}




