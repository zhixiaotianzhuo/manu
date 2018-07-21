package com.one.zero.manu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MANU on 2018/6/26.
 */
@Controller
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/test-controller01")
    public String testController01() {
        return "tables";
    }


    @RequestMapping("/tables/{id}")
    public String tablesFindTestById(@PathVariable Integer id, Model model){

        /*System.out.println(id);
        Test t1 = testService.findTestById(id);
        Test t2 = testService.findTestById(id+1);

        List<Test> ts = new LinkedList<>();
        ts.add(t1);
        ts.add(t2);

        model.addAttribute("ttt", t1);
        model.addAttribute("tttList", ts);*/

        return "tables";
    }
}
