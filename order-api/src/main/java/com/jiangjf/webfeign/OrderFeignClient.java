package com.jiangjf.webfeign;

import com.jiangjf.dto.OrderDTO;
import com.jiangjf.fallback.OrderFeignClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author jiangjf
 * @date 2021/12/26
 */
@FeignClient(name = "jiangjf-order", fallback = OrderFeignClientFallback.class)
public interface OrderFeignClient {
    /**
     * 远程调用
     *
     * @param orderDTO 入参
     * @return {@link String}
     */
    @PostMapping("/order/add")
    String add(OrderDTO orderDTO);
}
