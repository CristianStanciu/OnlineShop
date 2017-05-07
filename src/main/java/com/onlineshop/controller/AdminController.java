package com.onlineshop.controller;
import com.onlineshop.Dao.ProductDao;
import com.onlineshop.model.Product;
import com.onlineshop.model.ProductType;
import com.onlineshop.util.MyCustomNumberEditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by smc on 5/7/2017.
 */

@Controller
public class AdminController {

    @Autowired
    private ProductDao productDao;

    Path path;


    @InitBinder
    public void registerCustomerBinder(WebDataBinder binder) {
        binder.registerCustomEditor(double.class, new MyCustomNumberEditor(Double.class));
        binder.registerCustomEditor(float.class, new MyCustomNumberEditor(Float.class));
        binder.registerCustomEditor(long.class, new MyCustomNumberEditor(Long.class));
        binder.registerCustomEditor(int.class, new MyCustomNumberEditor(Integer.class));
    }

    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }


    @RequestMapping("/admin/productInventory")
    public String prodcutInventory(Model model){
        List<Product> productList = productDao.getAllProducts();
        model.addAttribute("productList", productList);
        return "productInventory";
    }


    @RequestMapping(value = "/admin/productInventory/addProduct", method = RequestMethod.GET)
    public String addProduct(Model model){

        System.out.println("**************************invoking add product get method");

        Product product = new Product();
        List<ProductType> allProductTypes = productDao.getAllProductTypes();
        model.addAttribute("productTypes", allProductTypes);
        model.addAttribute(product);
        return "addProduct";
    }

    @RequestMapping(value = "/admin/productInventory/addProduct", method = RequestMethod.POST)
    public String addNewProduct(@Valid @ModelAttribute("product") Product product, BindingResult result, HttpServletRequest request, Model model){

        System.out.println("******************************invoking add product post method");

        if (result.hasErrors()){

            List<ProductType> allProductTypes = productDao.getAllProductTypes();
            model.addAttribute("productTypes", allProductTypes);

            return "addProduct";
        }


        productDao.addProduct(product);

        String rootDir = request.getSession().getServletContext().getRealPath("/");

        MultipartFile productImage = product.getProductImage();

        path = Paths.get(rootDir + "\\WEB-INF\\resources\\images\\" +product.getProductId()+ ".png");

        if (productImage != null && !productImage.isEmpty()){
            try {
                productImage.transferTo(new File(path.toString()));
            } catch (IOException e) {
                throw new RuntimeException("Saving image file error!");
            }
        }
        return "redirect:/admin/productInventory";
    }

    @RequestMapping("/admin/productInventory/deleteProduct/{productId}")
    public String deleteProduct(@PathVariable("productId") int productId, Model model, HttpServletRequest request) {

        System.out.println("**************************invoking del product method");

        productDao.deleteProduct(productId);

        String rootDir = request.getSession().getServletContext().getRealPath("/");

        path = Paths.get(rootDir + "\\WEB-INF\\resources\\images\\" +productId+ ".png");

        if (Files.exists(path)){
            try {
                Files.delete(path);
            } catch (IOException e) {
                throw new RuntimeException("Deleting product image file error!");
            }
        }
        return "redirect:/admin/productInventory";
    }

    @RequestMapping("/admin/productInventory/editProduct/{productId}")
    public String editProduct(@PathVariable("productId") int productId, Model model) {

        System.out.println("**************************invoking editProduct get  method");


        List<ProductType> allProductTypes = productDao.getAllProductTypes();
        model.addAttribute("productTypes", allProductTypes);

        Product product = productDao.getProductById(productId);
        model.addAttribute(product);
        return "editProduct";
    }

    @RequestMapping(value = "/admin/productInventory/editProduct", method = RequestMethod.POST)
    public String editProduct(@Valid @ModelAttribute("product") Product product, BindingResult result, HttpServletRequest request, Model model){

        System.out.println("**************************invoking editProduct post method");

        if (result.hasErrors()){

            List<ProductType> allProductTypes = productDao.getAllProductTypes();
            model.addAttribute("productTypes", allProductTypes);

            return "editProduct";
        }


        MultipartFile productImage = product.getProductImage();

        String rootDir = request.getSession().getServletContext().getRealPath("/");

        path = Paths.get(rootDir + "\\WEB-INF\\resources\\images\\" +product.getProductId()+ ".png");

        if (productImage != null && !productImage.isEmpty()){
            try {
                productImage.transferTo(new File(path.toString()));
            } catch (IOException e) {
                throw new RuntimeException("Saving image file error!");
            }
        }
        productDao.addProduct(product);

        return "redirect:/admin/productInventory";
    }

}
