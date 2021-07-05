package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.example.demo")
public class JavaContainer {
	
	@Bean
	public Details fun1() {
		return new Details("Wasim" , 22);
	}	
	
	@Bean
	public User fun2() {
		User user = new User();
		user.setAddress("Delhi");
		user.setName("User");
		return user;
			
	}
	
}
