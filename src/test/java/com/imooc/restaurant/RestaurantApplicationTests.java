package com.imooc.restaurant;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;



@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class RestaurantApplicationTests {
	
//	 private final Logger logger = LoggerFactory.getLogger(RestaurantApplicationTests.class);

	@Test
	void contextLoads() {
//		logger.debug("this is debug");
//		logger.info("this is info");
//		logger.error("this is error");
		log.debug("this is debug");
		log.info("this is info {}, {}", 1, 2);
		log.error("this is error");
	}

}
