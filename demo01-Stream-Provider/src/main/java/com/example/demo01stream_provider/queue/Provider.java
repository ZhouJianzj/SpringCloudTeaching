package com.example.demo01stream_provider.queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author zhoujian
 */
@EnableBinding(Source.class)
@RestController
public class Provider {
    @Autowired
    @Output(Source.OUTPUT)
    private MessageChannel channel;

    @GetMapping("send")
    public void send() {

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

        // 延迟0秒，然后每隔5秒执行一次任务
        executorService.scheduleAtFixedRate(() -> {
            // 这里放置您要执行的代码
            channel.send(MessageBuilder.withPayload("Hello World!" + System.currentTimeMillis()).build());
        }, 0, 1, TimeUnit.SECONDS);
    }
}
