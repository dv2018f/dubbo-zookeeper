package com.dv.service.Impl;

import com.dv.service.TicketService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author dv
 * @version 1.0
 * @date 2020/4/12 13:14
 * @description 描述
 */

//zookeeper ：服务注册与发现

@Service  //可以被扫描到，在项目一启动就自动注册到注册中心
@Component
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "大哥威！";
    }
}
