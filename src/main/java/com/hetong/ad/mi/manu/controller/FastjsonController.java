package com.hetong.ad.mi.manu.controller;

import com.hetong.ad.mi.manu.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
/**
 * Created by MANU on 2018/6/26.
 */
@Controller
@RequestMapping("fastjson")
public class FastjsonController {

    @RequestMapping("/testUser")
    @ResponseBody
    public User testUser() {
        User user = new User();

        user.setId(1);
        user.setUsername("jack");
        user.setPassword("jack123");
        user.setBirthday(new Date());

        return user;
    }
}
