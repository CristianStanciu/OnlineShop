package com.onlineshop.controller;

import com.onlineshop.model.entity.*;
import com.onlineshop.service.CartService;
import com.onlineshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by smc on 5/10/2017.
 */

@Controller
public class OrderController {

    @Autowired
    CartService cartService;

    @Autowired
    OrderService orderService;

    @RequestMapping("/order/{cartId]")
    public String createOrder(@PathVariable(value = "cartId") int cartId)  {
        Order order = new Order();
        Cart cart = cartService.getCartById(cartId);
        order.setCartId(cart);

        Customer customer = cart.getCustomerId();
        order.setCustomerId(customer);

        Invoice invoice = new Invoice();
        invoice.setOrderId(order);

        BillingAddress billingAddress = customer.getBillingAddress();

        Shipment shipment = new Shipment();

        shipment.setBillingAddress(billingAddress);

        return "redirect:/checkout?cartId="+cartId;


    }
}
