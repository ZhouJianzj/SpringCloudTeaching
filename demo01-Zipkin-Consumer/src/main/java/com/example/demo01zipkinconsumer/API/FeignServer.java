package com.example.demo01zipkinconsumer.API;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhoujian
 */
@FeignClient(name = "provider")
public interface FeignServer {
    @GetMapping("/test")
    public String testMethod();

}
