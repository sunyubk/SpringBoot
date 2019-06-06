package com.sy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * Created by SY on 2019/6/4.
 */
@Controller
public class HelloController {

//    @RequestMapping({"/","/index"})
//    public String index(){
//        return "index";
//    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello word!";
    }


    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("name","<h1>张三</h1>");
        map.put("users", Arrays.asList("a","b","c"));
        return "success";
    }
}
