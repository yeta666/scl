package com.yeta.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017-12-18.
 */
@RestController
public class ConfigclientController {

    @Value("${foo}")
    private String foo;

    @GetMapping(value = "/foo")
    public String foo() {
        return foo;
    }
}
