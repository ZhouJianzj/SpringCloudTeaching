package com.zj.demo01eurekaconsumerfeignhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhoujian
 */
@SpringBootApplication
@EnableHystrix
@EnableEurekaClient
@EnableFeignClients
public class Demo01EurekaConsumerFeignHystrixApplication02 {

    public static void main(String[] args) {
        SpringApplication.run(Demo01EurekaConsumerFeignHystrixApplication02.class, args);
    }

}
