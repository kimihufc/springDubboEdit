package com.hjl.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hjl.dd.Order;
import com.hjl.facade.dd.OrderFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: HJL
 * @create: 2019-01-17 20:26
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Reference
    private OrderFacade orderFacade;

    @RequestMapping(value = "gainOrder")
    public String gainOrder(String name){
        Order order = orderFacade.getOrder(name);
        return order.toString();
    }
}
