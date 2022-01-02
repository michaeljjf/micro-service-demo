package com.jiangjf.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jiangjf
 * @date 2022/1/2
 */
@Configuration
public class OrderActuator {

    @Bean
    public ServletRegistrationBean getServletRegistrationBean() {
        HystrixMetricsStreamServlet hystrixMetricsStreamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(hystrixMetricsStreamServlet);
        servletRegistrationBean.setLoadOnStartup(1);
        servletRegistrationBean.setName("servletRegistrationBean");
        servletRegistrationBean.addUrlMappings("/hystrix.stream");
        return servletRegistrationBean;
    }
}
