package com.onlineshop.controller;
import com.onlineshop.model.entity.Product;
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
        List<Product> products = productService.getProductList();
        model.addAttribute("products", products);
        return "productList";
    }

    @RequestMapping("/viewProduct/{productId}")
    public String viewProduct(@PathVariable(name = "productId") int productId, Model model )throws IOException {

        Product product = productService.getProductById(productId);
        model.addAttribute("product", product);
        return "viewProduct";

    }
}
