package com.sy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SY on 2019/5/8.
 */
//@ResponseBody //s 这个类的所有方法返回的数据直接写给浏览器（如果是对象，转换成json）
//@Controller
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }
}
