package com.explore.srpringdemos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages="com.explore.kafka")
@SpringBootApplication
public class SpringDemosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemosApplication.class, args);
	}

}
