package com.zj.demo01eurekaprovider.service;


import com.zj.entities.User;

/**
 * @author zhoujian
 */
public interface UserServer {
    String returnUserName(String name);
    int returnUserAge(int age);

    User returnUser(String name, int age);
}
