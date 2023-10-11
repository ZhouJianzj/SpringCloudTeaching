package com.example.demo01zipkinproviderprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujian
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String testMethod(){
        return "这是Provider-Provider的testMethod()方法！";
    }
}
