package com.yeta.ribbon.controller;

import com.yeta.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017-12-18.
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam(value = "name") String name) {
        return ribbonService.hi(name);
    }
}
