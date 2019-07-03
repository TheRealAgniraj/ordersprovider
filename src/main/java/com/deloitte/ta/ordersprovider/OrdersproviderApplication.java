package com.deloitte.ta.ordersprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class OrdersproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdersproviderApplication.class, args);
	}

}
