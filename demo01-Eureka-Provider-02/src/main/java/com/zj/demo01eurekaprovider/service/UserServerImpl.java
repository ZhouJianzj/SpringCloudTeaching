package com.zj.demo01eurekaprovider.service;


import com.zj.entities.User;
import org.springframework.stereotype.Service;

/**
 * @author zhoujian
 */
@Service
public class UserServerImpl implements UserServer {

    /**
     * 传入一个字符串返回一个name，字符串当作user name
     * @param name
     * @return
     */
    @Override
    public String returnUserName(String name) {
        User user = new User();
        user.setName(name);
        return user.getName();
    }

    /**
     * 传入一个int返回一个age，int当作user age
     * @param age
     * @return
     */
    @Override
    public int returnUserAge(int age) {
        User user = new User();
        user.setAge(age);
        return user.getAge();
    }

    /**
     * 传入一string  int  返回一个User对象 string作为nane  int age
     * @param name
     * @param age
     * @return
     */
    @Override
    public User returnUser(String name, int age ) {
        return new User(name,age);
    }
}
