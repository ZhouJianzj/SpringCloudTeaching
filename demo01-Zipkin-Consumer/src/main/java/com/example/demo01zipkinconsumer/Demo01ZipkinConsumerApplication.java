package com.example.demo01zipkinconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhoujian
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Demo01ZipkinConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01ZipkinConsumerApplication.class, args);
    }

}
