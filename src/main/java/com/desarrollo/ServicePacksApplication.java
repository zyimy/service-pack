package com.desarrollo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ServicePacksApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicePacksApplication.class, args);
	}

}
