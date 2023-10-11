package com.example.demo01zipkinprovider.API;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhoujian
 */
@FeignClient(name = "provider-provider")
public interface FeignServer {
    @GetMapping("/test")
    public String testMethod();

}
