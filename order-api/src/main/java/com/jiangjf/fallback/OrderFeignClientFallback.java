package com.jiangjf.fallback;

import com.jiangjf.dto.OrderDTO;
import com.jiangjf.webfeign.OrderFeignClient;
import org.springframework.stereotype.Component;

/**
 * @author jiangjf
 * @date 2022/1/1
 */
@Component
public class OrderFeignClientFallback implements OrderFeignClient {
    @Override
    public String add(OrderDTO orderDTO) {
        System.out.println("发生的服务降级");
        return null;
    }
}
