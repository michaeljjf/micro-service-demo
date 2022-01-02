package com.jiangjf;

import com.jiangjf.dto.OrderDTO;
import com.jiangjf.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class OrderApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    private OrderService orderService;

    @Test
    void createOrder() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setNumber("123456");
        int order = orderService.createOrder(orderDTO);
        System.out.println(order);
    }
}
