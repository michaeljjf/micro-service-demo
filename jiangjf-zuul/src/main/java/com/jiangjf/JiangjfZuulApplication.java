package com.jiangjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author jiangjf
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class JiangjfZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiangjfZuulApplication.class, args);
    }

}
