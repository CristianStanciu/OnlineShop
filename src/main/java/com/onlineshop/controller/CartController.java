package com.onlineshop.controller;

import com.onlineshop.model.entity.Customer;
import com.onlineshop.model.vo.CustomerVO;
import com.onlineshop.service.CartService;
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

    @RequestMapping
    public String getCart(@AuthenticationPrincipal org.springframework.security.core.userdetails.User activeUser) {
        CustomerVO customer = customerService.getCustomerByUsername(activeUser.getUsername());
        int cartId = customer.getCartId().getCartId();
        return "redirect:/customer/cart/" + cartId;
    }

    @RequestMapping("/{cartId}")
    public String getCartRedirect(@PathVariable(value = "cartId") int cartId, Model model) {
        model.addAttribute("cartId", cartId);
        return "cart";
    }

}
