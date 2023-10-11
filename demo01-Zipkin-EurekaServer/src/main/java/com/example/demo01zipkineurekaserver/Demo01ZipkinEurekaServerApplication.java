package com.example.demo01zipkineurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhoujian
 */
@SpringBootApplication
@EnableEurekaServer
public class Demo01ZipkinEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01ZipkinEurekaServerApplication.class, args);
    }

}
