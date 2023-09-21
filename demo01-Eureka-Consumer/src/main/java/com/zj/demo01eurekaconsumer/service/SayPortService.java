package com.zj.demo01eurekaconsumer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SayPortService {
    @Autowired
    RestTemplate restTemplate;
    /**
    需要访问 provider 里面的PortController =》 sayPort
     */
    public String consumerSayPortMethod(){
        return restTemplate.getForObject("http://provider/sayPort",String.class);
    }

}
