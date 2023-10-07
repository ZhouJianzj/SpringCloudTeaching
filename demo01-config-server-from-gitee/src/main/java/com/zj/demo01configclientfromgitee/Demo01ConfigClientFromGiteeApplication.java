package com.zj.demo01configclientfromgitee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Demo01ConfigClientFromGiteeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01ConfigClientFromGiteeApplication.class, args);
    }

}
