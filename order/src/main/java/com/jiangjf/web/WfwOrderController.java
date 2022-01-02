package com.jiangjf.web;

import com.jiangjf.dto.OrderDTO;
import com.jiangjf.service.OrderService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author jiangjf
 * @date 2021/12/26
 */
@CrossOrigin
@RestController
@RequestMapping("/order")
public class WfwOrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("/add")
    public String addOrder(@RequestBody OrderDTO orderDTO) {
        System.out.println(orderDTO);
        int order = orderService.createOrder(orderDTO);
        return String.valueOf(order);
    }
}
