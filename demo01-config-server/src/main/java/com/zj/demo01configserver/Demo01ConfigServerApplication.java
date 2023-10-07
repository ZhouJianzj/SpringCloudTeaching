package com.zj.demo01configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhoujian
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class Demo01ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01ConfigServerApplication.class, args);
    }

}
