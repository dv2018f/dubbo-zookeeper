package com.dv.service;

import com.dv.bean.Order;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dv
 * @version 1.0
 * @date 2020/4/12 13:18
 * @description 描述
 */
@Service //放到容器中
public interface UserService {

   String getTicket();

   List<Order> getOrderInfo(String uid);
}
