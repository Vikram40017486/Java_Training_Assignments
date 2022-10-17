package com.ltts.iplregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class IplregistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(IplregistrationApplication.class, args);
	}

}
