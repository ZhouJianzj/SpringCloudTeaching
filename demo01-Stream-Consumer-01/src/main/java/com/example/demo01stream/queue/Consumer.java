package com.example.demo01stream.queue;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author zhoujian
 */
@EnableBinding(Sink.class)
public class Consumer {
    @StreamListener(Sink.INPUT)
    public void receiver(String message) {
        System.out.println("接收到MQ消息:" + message);
    }
}

