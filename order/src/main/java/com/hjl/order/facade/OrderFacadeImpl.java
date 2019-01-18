package com.hjl.order.facade;

import com.alibaba.dubbo.config.annotation.Service;
import com.hjl.dd.Order;
import com.hjl.facade.dd.OrderFacade;

/**
 * @author: HJL
 * @create: 2019-01-17 20:11
 */
@Service
public class OrderFacadeImpl implements OrderFacade {

    @Override
    public Order getOrder(String name) {
        Order result = new Order();
        result.setName(name);
        result.setPrice("0.00");
        return result;
    }
}
