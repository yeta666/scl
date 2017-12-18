package com.yeta.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017-12-18.
 */
@RestController
public class HiController {

    /**
     * 从配置文件获取端口号
     */
    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam(value = "name") String name) {
        return "Hi " + name + ", this is SERVICE-HI from port " + port;
    }

}
