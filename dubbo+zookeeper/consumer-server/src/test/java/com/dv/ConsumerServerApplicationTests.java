package com.dv;

import com.dv.bean.Order;
import com.dv.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ConsumerServerApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {

        userService.getTicket();
    }

    @Test
    public void test(){
        System.out.println(userService.getTicket());
    }

    @Test
    public void test1(){
        List<Order> u1 = userService.getOrderInfo("u1");
        u1.stream().forEach(System.out::println);
    }

}
