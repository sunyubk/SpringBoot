package com.sy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by SY on 2019/5/7.
 */
@Controller
public class HelloController {

    @Autowired
    String hello;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return hello;
    }
}
