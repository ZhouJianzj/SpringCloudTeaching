package com.zj.demo01configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhoujian
 */
@SpringBootApplication
@EnableEurekaClient
public class Demo01ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01ConfigClientApplication.class, args);
    }

}
