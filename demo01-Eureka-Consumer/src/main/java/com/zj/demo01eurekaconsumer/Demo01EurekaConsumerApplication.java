package com.zj.demo01eurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Demo01EurekaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01EurekaConsumerApplication.class, args);
    }

}
