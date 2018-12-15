package com.tantalum.message.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages={"com.tantalum.message"})
@EnableDiscoveryClient
public class MessageApiApplication {
	
	private static final Logger log = LoggerFactory.getLogger(MessageApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MessageApiApplication.class, args);
	}
}
