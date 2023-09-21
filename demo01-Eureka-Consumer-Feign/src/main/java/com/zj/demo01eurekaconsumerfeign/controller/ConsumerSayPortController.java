package com.zj.demo01eurekaconsumerfeign.controller;

import com.zj.entities.User;
import com.zj.service.ProviderServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujian
 */
@RestController
public class ConsumerSayPortController {
    @Autowired
    ProviderServer sayPortService;


    @GetMapping("consumerSayPort")
    public String consumerSayPort(){
        return sayPortService.sayPort();
    }


}
