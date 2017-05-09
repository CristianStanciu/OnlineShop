package com.onlineshop.controller.admin;
import com.onlineshop.model.entity.Product;
import com.onlineshop.service.ProductService;
import com.onlineshop.util.MyCustomNumberEditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import java.nio.file.Path;
import java.util.List;

/**
 * Created by smc on 5/7/2017.
 */

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ProductService productService;

    Path path;


    @InitBinder
    public void registerCustomerBinder(WebDataBinder binder) {
        binder.registerCustomEditor(double.class, new MyCustomNumberEditor(Double.class));
        binder.registerCustomEditor(float.class, new MyCustomNumberEditor(Float.class));
        binder.registerCustomEditor(long.class, new MyCustomNumberEditor(Long.class));
        binder.registerCustomEditor(int.class, new MyCustomNumberEditor(Integer.class));
    }

    @RequestMapping()
    public String adminPage(){
        return "admin";
    }


    @RequestMapping("/productInventory")
    public String prodcutInventory(Model model){
        List<Product> productList = productService.getProductList();
        model.addAttribute("productList", productList);
        return "productInventory";
    }

    @RequestMapping("/customer")
    public String customerManagement(Model model){
        return "customerManagement";
    }




}
