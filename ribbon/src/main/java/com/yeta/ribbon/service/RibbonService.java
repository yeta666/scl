package com.yeta.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017-12-18.
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 消费SERVICE-HI服务的hi接口
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "error")       //对hi方法开启熔断器功能，并指定熔断方法
    public String hi(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }

    /**
     * 熔断方法
     * @param name
     * @return
     */
    public String error(String name) {
        return "Sorry " +  name + ", this may be some error!";
    }
}
