package com.zj.service;


import com.zj.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhoujian
 */
//@FeignClient("provider")
public interface ProviderServer {
    /**
     * 需要访问 provider 里面的PortController =》 sayPort
     */
    @GetMapping("/sayPort")
    String sayPort();

    @PostMapping("/name")
    public String returnUserNameController(@RequestParam String name);
    @PostMapping("/age")
    public int returnUserAgeController(@RequestParam(value = "age") int age);
    @PostMapping("/user")
    public User returnUserController(@RequestBody User user);
}
