package com.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Config1Application {

	
	public static void main(String[] args) {
		SpringApplication.run(Config1Application.class, args);
	}

}
