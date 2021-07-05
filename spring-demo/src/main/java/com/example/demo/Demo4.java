package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo4 {
	
	@Autowired()
	public Details2 details2;
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaContainer.class);
		
		Details details = (Details) applicationContext.getBean(Details.class);
		
		System.out.println(details);
			
		
		User user = applicationContext.getBean(User.class);
		
		System.out.println(user);
		
		
	}
	
}
