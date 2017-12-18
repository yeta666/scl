package com.yeta.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017-12-18.
 */
@FeignClient(value = "SERVICE-HI", fallback = FeignErrorService.class)      //指定调用服务，并指定熔断类
public interface FeignService {

    @GetMapping(value = "/hi")
    String hi(@RequestParam(value = "name") String name);
}
