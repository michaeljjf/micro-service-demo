package com.jiangjf.repository;

import com.jiangjf.entity.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jiangjf
 * @date 2021/12/26
 */
public interface OrderRepository extends JpaRepository<OrderInfo, Integer> {
}
