package com.sy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:beans.xml"})  //导入spring配置文件，不是那么好用
@SpringBootApplication
public class SpringBoot02ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot02ConfigApplication.class, args);
	}

}
