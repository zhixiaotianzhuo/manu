package com.hetong.ad.mi.manu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by MANU on 2018/6/26.
 */
@Controller
@RequestMapping("freemarker")
public class FreemarkerController {

    @RequestMapping("hello_freemarker")
    public String hello(Map<String,Object> map) {

        map.put("msg", "Hello Freemarker");
        return "hello_freemarker";
    }
}
