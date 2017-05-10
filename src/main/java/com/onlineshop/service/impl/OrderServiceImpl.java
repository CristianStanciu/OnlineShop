package com.onlineshop.service.impl;

import com.onlineshop.controller.dao.OrderDao;
import com.onlineshop.model.entity.Cart;
import com.onlineshop.model.entity.CartItem;
import com.onlineshop.model.entity.Order;
import com.onlineshop.service.CartService;
import com.onlineshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by smc on 5/10/2017.
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private CartService cartService;


    public void addOrder(Order order) {
        orderDao.addOrder(order);
    }

    public double getOrderTotalPrice(int cartId) {
        double totalPrice = 0;
        Cart cart = cartService.getCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();
        for (CartItem cartItem : cartItems) {
            totalPrice += cartItem.getTotalPrice();
        }
        return totalPrice;
    }
}
