package com.thinkBeyond.jenkinsIntegration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsIntegrationApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsIntegrationApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application started");
	}

	public static int main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(JenkinsIntegrationApplication.class, args);
	}

}
