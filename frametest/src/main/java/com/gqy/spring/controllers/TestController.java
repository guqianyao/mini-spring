package com.gqy.spring.controllers;

import com.gqy.spring.web.mvc.Controller;
import com.gqy.spring.web.mvc.RequestParam;
import com.gqy.spring.web.mvc.RequsetMapping;

@Controller
public class TestController {

    @RequsetMapping("/getTest")
    public Integer getTestResult(@RequestParam("test1") String test1,@RequestParam("test2") String test2){
        System.out.println(test1);
        System.out.println(test2);
        return  10;
    }
}
