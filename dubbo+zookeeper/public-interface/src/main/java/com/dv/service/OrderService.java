package com.dv.service;

import com.dv.bean.Order;

import java.util.List;

/**
 * @author dv
 * @version 1.0
 * @date 2020/4/12 16:10
 * @description 描述
 */
public interface OrderService {

    public List<Order> getOrderByUid(String uid);
}
