package com.yeta.feign.service;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017-12-18.
 */
@Component
public class FeignErrorService implements FeignService {

    @Override
    public String hi(String name) {
        return "Sorry " + name + ", this may be some errors!";
    }
}
