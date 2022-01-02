package com.jiangjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * EnableDiscoveryClient 代表当前是服务消费者
 * EnableFeignClients 未标注该注解会导致无法注入bean
 * @author jiangjf
 */
@SpringBootApplication
//@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class OrderApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApiApplication.class, args);
    }

}
