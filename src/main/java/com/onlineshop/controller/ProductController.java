package com.onlineshop.controller;

import com.onlineshop.model.vo.ProductVO;
import com.onlineshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

/**
 * Created by smc on 5/9/2017.
 */

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/productList")
    public String getProducts(Model model) {
        List<ProductVO> products = productService.getProductList();
        model.addAttribute("productList", products);
        return "productList";
    }


    @RequestMapping("/category/{productType}")
    public String getProductsByType(@PathVariable(name = "productType") String productType, Model model ){
        List<ProductVO> products = productService.getProductsByType(productType.toUpperCase());
        model.addAttribute("productsByType", products);
        return "productByType";

    }



    @RequestMapping("/viewProduct/{productId}")
    public String viewProduct(@PathVariable(name = "productId") int productId, Model model ) {
        ProductVO product = productService.getProductById(productId);
        model.addAttribute("product", product);
        return "viewProduct";

    }
}
