package com.zj.demo01eurekaconsumer.controller;


import com.zj.demo01eurekaconsumer.service.SayPortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerSayPortController {
    @Autowired
    SayPortService sayPortService;

    @GetMapping("consumerSayPort")
    public String consumerSayPort(){
        return sayPortService.consumerSayPortMethod();
    }

}
