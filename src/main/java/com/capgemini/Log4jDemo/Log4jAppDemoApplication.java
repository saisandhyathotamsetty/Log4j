package com.capgemini.Log4jDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4jAppDemoApplication {

	private static Logger logger = LogManager.getLogger(Log4jAppDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Log4jAppDemoApplication.class, args);
		System.out.println("Hello World");



		logger.info("This is information message");
		logger.error("This is error message");
		logger.warn("This is warning message");
		logger.fatal("This is fatal message");



		System.out.println("Completed");

}
}

