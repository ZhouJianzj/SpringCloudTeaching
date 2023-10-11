package com.zj.demo01zikpinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;


/**
 * @author zhoujian
 */
@SpringBootApplication
@EnableZipkinServer
public class Demo01ZikpinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01ZikpinServerApplication.class, args);
    }

}
