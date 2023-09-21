package com.zj.demo01eurekaconsumerfeign.service;

import com.zj.demo01eurekaconsumerfeign.feign.FeignConfig;
import com.zj.service.ProviderServer;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author zhoujian
 */
@FeignClient(value = "provider",configuration = FeignConfig.class)
public interface UserService extends ProviderServer {

}
