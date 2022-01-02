package com.jiangjf.web;

import com.jiangjf.dto.OrderDTO;
import com.jiangjf.webfeign.OrderFeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author jiangjf
 * @date 2021/12/26
 */
@RestController
@RequestMapping("/order-api")
public class OrderController {

    @Resource
    private OrderFeignClient orderFeignClient;

    @RequestMapping("/add")
    public String addOrder(@RequestBody @Valid OrderDTO orderDTO) {
        System.out.println("order-api" + orderDTO);
        String result = orderFeignClient.add(orderDTO);
        System.out.println("result:" + result);
        return null == result ? "error" : result;
    }
}
