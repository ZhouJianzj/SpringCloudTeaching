package com.zj.demo01eurekaconsumerfeignhystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author zhoujian
 */
@SpringBootApplication
@EnableHystrixDashboard
public class Demo01EurekaConsumerFeignHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01EurekaConsumerFeignHystrixDashboardApplication.class, args);
    }

}
