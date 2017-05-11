package com.onlineshop.controller;
import com.onlineshop.controller.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by smc on 5/1/2017.
 */

@Controller
public class HomeController {


    @RequestMapping("/")
    public String home() {
        return "home";
    }

}




