package com.zj.demo01eurekaconsumerfeign.controller;


import com.zj.demo01eurekaconsumerfeign.service.UserService;
import com.zj.entities.User;
import com.zj.service.ProviderServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujian
 */
@RestController
public class UserControllerFeign {
    @Autowired
    ProviderServer userServer;

    @PostMapping("/name")
    public String returnUserNameController(@RequestParam String name) {
        return userServer.returnUserNameController(name);
    }

    @PostMapping("/age")
    public int returnUserAgeController(@RequestParam int age) {
        return userServer.returnUserAgeController(age);
    }

    @PostMapping("/user")
    public User returnUserController(@RequestBody User user) {
        return userServer.returnUserController(user);
    }

}
