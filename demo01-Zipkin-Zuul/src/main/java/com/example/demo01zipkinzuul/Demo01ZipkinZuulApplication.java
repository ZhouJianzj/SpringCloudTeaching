package com.example.demo01zipkinzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author zhoujian
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class Demo01ZipkinZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01ZipkinZuulApplication.class, args);
    }

}
