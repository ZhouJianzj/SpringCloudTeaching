package com.zj.demo01eurekaserver02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhoujian
 */
@SpringBootApplication
@EnableEurekaServer
public class Demo01EurekaServer02Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo01EurekaServer02Application.class, args);
    }

}
