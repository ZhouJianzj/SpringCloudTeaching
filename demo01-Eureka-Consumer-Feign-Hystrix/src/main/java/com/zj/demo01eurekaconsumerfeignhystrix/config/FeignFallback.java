package com.zj.demo01eurekaconsumerfeignhystrix.config;

import com.zj.demo01eurekaconsumerfeignhystrix.service.UserService;
import com.zj.entities.User;
import org.springframework.stereotype.Component;

/**
 *
 */

@Component
public class FeignFallback implements UserService {
    @Override
    public String sayPort() {
        return "系统出现错误！请稍后再试！";
    }

    @Override
    public String returnUserNameController(String name) {
        return null;
    }

    @Override
    public int returnUserAgeController(int age) {
        return 0;
    }

    @Override
    public User returnUserController(User user) {
        return null;
    }
}
