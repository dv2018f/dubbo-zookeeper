package com.dv.service.Impl;

import com.dv.bean.Order;
import com.dv.service.OrderService;
import com.dv.service.TicketService;
import com.dv.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dv
 * @version 1.0
 * @date 2020/4/12 14:01
 * @description 描述
 */
@Service
public class UserServiceImpl implements UserService {


    //想拿到provider提供的票,要去注册中西拿到服务

    @Reference //引用 //远程引用指定的服务，他会按照全类名进行匹配，看谁给注册中心注册了这个全类名
    TicketService ticketService;

    @Reference //引用
    OrderService orderService;

    @Override
    public String getTicket() {
        return ticketService.getTicket();
    }

    @Override
    public List<Order> getOrderInfo(String uid) {
        return orderService.getOrderByUid(uid);
    }
}
