package com.zj.demo01eurekaserver01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Demo01EurekaServer01Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo01EurekaServer01Application.class, args);
    }

}
