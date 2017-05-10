package com.onlineshop.controller;

import com.onlineshop.controller.dao.CartDao;
import com.onlineshop.model.entity.Cart;
import com.onlineshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by smc on 5/10/2017.
 */

@Controller
@RequestMapping("/customer/cart")
public class CartController {

    @Autowired
    CustomerService customerService;

    @Autowired
    CartDao cartDao;

    @RequestMapping("/")
    public String getCart(@AuthenticationPrincipal org.springframework.security.core.userdetails.User activeUser) {
        customerService.getCustomerByUsername(activeUser.getUsername());
        Cart cart = cartDao.create(new Cart()); // AICI TREBUIE REACUT CA NU E BINE!!!!
        return "redirect:/customer/cart/" + cart.getCartId();
    }

    @RequestMapping("/{cartId}")
    public String getCartRedirect(@PathVariable(value = "cartId") int cartId, Model model) {
        model.addAttribute("cartId", cartId);
        return "cart";
    }

}
