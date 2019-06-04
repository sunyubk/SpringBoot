package com.sy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot03LoggingApplicationTests {

	//记录器
	Logger logger = LoggerFactory.getLogger(getClass());
	@Test
	public void contextLoads() {
		//日志的级别
		//由低到高 trace < debug < info < warn < error
		//可以调整输出的日志级别：日志就是会在这个级别以及以后的高级别生效
		logger.trace("这是trace日志");
		logger.debug("这是debug日志");
		//springboot默认给给我们使用的info级别，没有指定级别的就用springboot默认的级别，root级别，可以自己调整级别，在application.properties中配置
		logger.info("这是info日志");
		logger.warn("这是warn日志");
		logger.error("这是error日志");
	}

}
