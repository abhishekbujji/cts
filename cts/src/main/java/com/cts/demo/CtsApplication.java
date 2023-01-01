package com.cts.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CtsApplication {

	public static void main(String[] args) {
		//Springboot application
		SpringApplication.run(CtsApplication.class, args);
		System.out.println("CTS");
	}

}
