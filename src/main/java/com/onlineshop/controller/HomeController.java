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

    @Autowired
    private ProductDao productDao;


//    @InitBinder
//    public void registerCustomerBinder(WebDataBinder binder) {
//        binder.registerCustomEditor(double.class, new MyCustomNumberEditor(Double.class));
//        binder.registerCustomEditor(float.class, new MyCustomNumberEditor(Float.class));
//        binder.registerCustomEditor(long.class, new MyCustomNumberEditor(Long.class));
//        binder.registerCustomEditor(int.class, new MyCustomNumberEditor(Integer.class));
//    }


    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error, @RequestParam(value = "logout", required = false) String logout, Model model ) {
        if (error != null) {
            model.addAttribute("error", "Invalid username or password");
        }
        if (logout!= null){
            model.addAttribute("logout", "You have succesfully logged out");
        }

        return "login";
    }




//    @RequestMapping("/productList")
//    public String getProducts(Model model) {
//        List<Product> products = productDao.getProductList();
//        model.addAttribute("products", products);
//        return "productList";
//    }
//
//    @RequestMapping("/productList/viewProduct/{productId}")
//    public String viewProduct(@PathVariable("productId") Product productId, Model model) throws IOException {
//        Product product = productDao.getProductById(productId);
//        model.addAttribute(product);
//        return "viewProduct";
//    }

}




