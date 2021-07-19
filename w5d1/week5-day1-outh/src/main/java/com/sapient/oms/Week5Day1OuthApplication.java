package com.sapient.oms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class Week5Day1OuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week5Day1OuthApplication.class, args);
	}

}
