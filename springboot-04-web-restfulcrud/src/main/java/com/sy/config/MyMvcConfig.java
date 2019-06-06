package com.sy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by SY on 2019/6/6.
 */

/**
 * 扩展配置既保留了自动配置也能扩展配置
 * 可以使用WebMvcConfigurerAdapter来扩展Spring Mvc的功能
 * 就不用再为springmvc配置xml文件了
 *
 * @EnableWebMvc:全面接管SpringMVC,SpringBoot对SpringMVC的自动配置不要了,所有SpringMVC的自动配置全部失效
 */
//@EnableWebMvc
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    //ctrl+o  打开WebMvcConfigurerAdapter可以重写的方法
    //addViewControllers：视图映射
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //super.addViewControllers(registry);
        registry.addViewController("/say").setViewName("success");
        registry.addViewController("/index").setViewName("index");
    }
}
