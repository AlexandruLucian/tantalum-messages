package com.tantalum.message.uuid.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages={"com.tantalum.message.uuid"})
@EnableDiscoveryClient
public class MessageApiUuidApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageApiUuidApplication.class, args);
	}

}
