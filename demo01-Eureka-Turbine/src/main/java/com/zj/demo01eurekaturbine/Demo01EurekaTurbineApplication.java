package com.zj.demo01eurekaturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author zhoujian
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class Demo01EurekaTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01EurekaTurbineApplication.class, args);
    }

}
