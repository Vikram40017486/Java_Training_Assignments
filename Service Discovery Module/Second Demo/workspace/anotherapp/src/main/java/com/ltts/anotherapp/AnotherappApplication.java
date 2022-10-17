package com.ltts.anotherapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AnotherappApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnotherappApplication.class, args);
	}

}
