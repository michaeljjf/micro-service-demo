package com.jiangjf.service;

import com.jiangjf.dto.OrderDTO;
import com.jiangjf.entity.OrderInfo;
import com.jiangjf.repository.OrderRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jiangjf
 * @date 2021/12/26
 */
@Service
public class OrderService {

    @Resource
    private OrderRepository orderRepository;

    /**
     * 生成一个订单
     *
     * @param orderDTO 入参
     * @return 订单编号
     */
    public int createOrder(OrderDTO orderDTO) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setNumber(orderDTO.getNumber());
        try {
            return orderRepository.save(orderInfo).getId();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return -1;
        }
    }
}
