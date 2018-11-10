package com.tantalum.message.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MessageApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageApiApplication.class, args);
	}
}
