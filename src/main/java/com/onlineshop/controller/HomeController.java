package com.onlineshop.controller;

import com.onlineshop.model.entity.Product;
import com.onlineshop.model.vo.ProductVO;
import com.onlineshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by smc on 5/1/2017.
 */

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    ProductService productService;

    @RequestMapping
    public String home(Model model) {

        List<ProductVO> productList = productService.getLatestProducts();
        model.addAttribute("lastFourProducts", productList);
        return "home";
    }


}




