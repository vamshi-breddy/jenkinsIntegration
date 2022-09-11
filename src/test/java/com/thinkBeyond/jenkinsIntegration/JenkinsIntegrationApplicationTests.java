package com.thinkBeyond.jenkinsIntegration;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsIntegrationApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsIntegrationApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executed");
		assertEquals(true, true);
	}

}
