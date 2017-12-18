package com.yeta.feign.controller;

import com.yeta.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017-12-18.
 */
@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam(value = "name") String name) {
        return feignService.hi(name);
    }
}
