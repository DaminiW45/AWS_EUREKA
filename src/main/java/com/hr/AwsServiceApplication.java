package com.hr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AwsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsServiceApplication.class, args);
	}

}
