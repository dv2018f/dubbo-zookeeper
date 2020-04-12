package com.dv.service.Impl;

import com.dv.bean.Order;
import com.dv.service.OrderService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author dv
 * @version 1.0
 * @date 2020/4/12 16:11
 * @description 描述
 */
@Service
@Component
public class OrderServiceImpl implements OrderService {
    @Override
    public List<Order> getOrderByUid(String uid) {

        Order order = new Order("o1", "u1", "iphone11");
        Order order1 = new Order("o2", "u1", "iphone8");
        List<Order> orders = Arrays.asList(order, order1);
        return orders;
    }
}
