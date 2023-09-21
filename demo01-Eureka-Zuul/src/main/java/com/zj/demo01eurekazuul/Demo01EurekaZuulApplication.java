package com.zj.demo01eurekazuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author zhoujian
 */
@SpringBootApplication
@EnableZuulProxy
public class Demo01EurekaZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01EurekaZuulApplication.class, args);
    }

}
