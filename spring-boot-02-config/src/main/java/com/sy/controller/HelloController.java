package com.sy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SY on 2019/5/8.
 */
@RestController
public class HelloController {

    @Value("${person.last-name}")
    String name;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "hello,"+name;
    }

    @Autowired
    String helloService;
    @RequestMapping("/helloService")
    public String helloService(){
        return helloService;
    }
}
