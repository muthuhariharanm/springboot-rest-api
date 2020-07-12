package com.project.restapi.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestAPI {

	public static void main(String[] args) {
		SpringApplication.run(RestAPI.class, args);
		System.out.println("Running on : 7070");
	}

}
