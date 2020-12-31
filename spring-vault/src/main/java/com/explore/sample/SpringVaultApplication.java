package com.explore.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@ComponentScan(basePackages="com.explore.sample")
@EnableConfigurationProperties(MyConfig.class)
@SpringBootApplication
public class SpringVaultApplication implements CommandLineRunner {

	 private final MyConfig configuration;
	 @Value("${password}")
     String s;
	  public SpringVaultApplication(MyConfig configuration) {
	    this.configuration = configuration;
	  }

	  public static void main(String[] args) {
	    SpringApplication.run(SpringVaultApplication.class, args);
	  }

	  @Override
	  public void run(String... args) {

	    Logger logger = LoggerFactory.getLogger(SpringVaultApplication.class);
	    System.out.println("username"+ s);

	    logger.info("----------------------------------------");
	    logger.info("Configuration properties");
	    logger.info("   example.username is {}", configuration.getUsername());
	    logger.info("   example.password is {}", configuration.getPassword());
	    logger.info("----------------------------------------");
	  }
}
