package com.zj.demo01eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Demo01EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01EurekaClientApplication.class, args);
    }

}
