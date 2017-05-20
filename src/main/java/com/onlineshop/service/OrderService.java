package com.onlineshop.service;

import com.onlineshop.model.vo.OrderVO;

/**
 * Created by smc on 5/10/2017.
 */

public interface OrderService {

    void addOrder(OrderVO order);

    double getOrderTotalPrice(int cartId);

}

