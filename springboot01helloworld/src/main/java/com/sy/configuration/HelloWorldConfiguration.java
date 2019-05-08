package com.sy.configuration;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Created by SY on 2019/5/7.
 */
@SpringBootConfiguration
public class HelloWorldConfiguration {
    @Bean
    public String hello(){
        return "你好，SpringBoot";
    }
}
