package com.sapient;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week5Day3SeleniumApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week5Day3SeleniumApplication.class, args);
	}
	
	@Bean
	public WebDriver webDriver() {
	    return new ChromeDriver();
	    //OR return new ChromeDriver();
	}
}

