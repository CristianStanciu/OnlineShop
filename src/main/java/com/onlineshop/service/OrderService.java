package com.onlineshop.service;

import com.onlineshop.model.entity.Order;

/**
 * Created by smc on 5/10/2017.
 */

public interface OrderService {

    void addOrder(Order order);

    double getOrderTotalPrice(int cartId);


}

