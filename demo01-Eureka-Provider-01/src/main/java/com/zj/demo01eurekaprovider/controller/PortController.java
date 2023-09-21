package com.zj.demo01eurekaprovider.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortController {
    @Value("${server.port}")
    String port;

    /**
     *     @RequestMapping(value = "/sayPort, method = RequestMethod.GET)
     * @return
     */
    @GetMapping("/sayPort")
    public String sayPort(){

//        test();

        System.out.println("当前访问的服务端口为：" + port);

        return "当前访问的服务端口为：" + port;

    }

    void  test(){
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
