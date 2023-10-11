package com.example.demo01zipkinconsumer.controller;

import com.example.demo01zipkinconsumer.API.FeignServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujian
 */
@RestController
public class TestController {

    @Autowired
    FeignServer feignServer;

    @GetMapping("/test")
    public String testMethod(){
      return feignServer.testMethod();
    }
}
