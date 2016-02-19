package com.webprimary.test;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.webprimary.service.UserService;

public class BaseTest {
	private Logger log = LoggerFactory.getLogger(getClass());
	
	protected UserService userService;

	@Before
    public void before(){                                                                    
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        userService = (UserService) context.getBean("userServiceImpl");
    }
	
    @Test
    public void cal() {
        int x = 3;
        int y = 7;
        int z = x^y;
        log.info("sf" + (x ^ y));
    }
}
