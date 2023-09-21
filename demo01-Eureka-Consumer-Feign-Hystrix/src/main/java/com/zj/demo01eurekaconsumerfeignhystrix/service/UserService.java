package com.zj.demo01eurekaconsumerfeignhystrix.service;

import com.zj.demo01eurekaconsumerfeignhystrix.config.FeignFallback;
import com.zj.service.ProviderServer;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author zhoujian
 */
@FeignClient(value = "provider",fallback = FeignFallback.class)
public interface UserService extends ProviderServer {

}
