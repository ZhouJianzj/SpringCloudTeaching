package com.zj.demo01configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujian
 */
@RestController
public class TestConfigController {

    @Value("${test.name}")
    String name;
    @Value("${test.age}")
    int age;

    @GetMapping("/test")
    public String testConfig() {
        return name + ":" + age;
    }
}
