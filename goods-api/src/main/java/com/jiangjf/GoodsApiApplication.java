package com.jiangjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author jiangjf
 */
@SpringBootApplication
@EnableEurekaClient
public class GoodsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsApiApplication.class, args);
    }

}
