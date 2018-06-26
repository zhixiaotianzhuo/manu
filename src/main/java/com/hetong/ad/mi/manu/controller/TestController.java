package com.hetong.ad.mi.manu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MANU on 2018/6/26.
 */
@RestController
public class TestController {

    @GetMapping("/test-controller01")
    public String testController01() {
        return "test-controller01";
    }
}
