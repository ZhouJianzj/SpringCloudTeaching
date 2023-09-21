package com.zj.demo01eurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Demo01EurekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01EurekaProviderApplication.class, args);
    }

}
