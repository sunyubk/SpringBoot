package com.sy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by SY on 2019/5/8.
 */
@Configuration//告诉springboot这是一个配置类
public class MyAppConfig {
    //将返回值添加到容器中,容器中默认的id就是这个方法名
    @Bean
    public String helloService(){
        return "This is helloService";
    }
}
