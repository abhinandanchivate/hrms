package com.concordia.soen6841.gateway2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class Gateway2Application {

	public static void main(String[] args) {
		SpringApplication.run(Gateway2Application.class, args);
	}

}
