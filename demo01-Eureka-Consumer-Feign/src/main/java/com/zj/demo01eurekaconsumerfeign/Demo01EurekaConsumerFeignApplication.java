package com.zj.demo01eurekaconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * @author zhoujian
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class Demo01EurekaConsumerFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(Demo01EurekaConsumerFeignApplication.class, args);
    }

}
