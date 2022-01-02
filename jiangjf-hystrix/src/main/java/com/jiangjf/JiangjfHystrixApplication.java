package com.jiangjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author jiangjf
 */
@SpringBootApplication
@EnableHystrixDashboard
public class JiangjfHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiangjfHystrixApplication.class, args);
    }

}
