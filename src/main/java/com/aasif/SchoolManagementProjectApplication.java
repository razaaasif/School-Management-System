package com.aasif;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchoolManagementProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementProjectApplication.class, args);
	}

}
