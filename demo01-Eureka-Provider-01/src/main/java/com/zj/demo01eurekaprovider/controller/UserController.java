package com.zj.demo01eurekaprovider.controller;

import com.zj.demo01eurekaprovider.service.UserServer;
import com.zj.entities.User;
import com.zj.service.ProviderServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhoujian
 */
@RestController
public class UserController implements ProviderServer {
    @Autowired
    UserServer userServer;

    @GetMapping("/consumerSayPort")
    public String sayPort() {
        return null;
    }

    @PostMapping("/name")
    public String returnUserNameController(@RequestParam String name) {
        return userServer.returnUserName(name);
    }

    @PostMapping("/age")
    public int returnUserAgeController(@RequestParam(value = "age") int age) {
        return userServer.returnUserAge(age);
    }

    @PostMapping("/user")
    public User returnUserController(@RequestBody User user) {

        return userServer.returnUser(user.getName(), user.getAge());
    }

    @GetMapping("hi")
    public String sayHi(){
        return "我是provider-01！ hi！";
    }

}
