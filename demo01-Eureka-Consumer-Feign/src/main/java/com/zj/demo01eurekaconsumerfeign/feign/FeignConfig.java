package com.zj.demo01eurekaconsumerfeign.feign;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhoujian
 */
@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level  feignLoggingLevel(){
        return Logger.Level.FULL;
    }
}
