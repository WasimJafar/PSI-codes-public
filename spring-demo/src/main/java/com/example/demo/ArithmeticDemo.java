package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArithmeticDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ArithmeticContainer.class);
		
		IArithmetic arithmetic = context.getBean(ArithmeticImplementation.class);
		
		try {
			
			System.out.println(arithmetic.add(10.0, 20.0));
			System.out.println(arithmetic.sub(200.0, 10000.0));
			
			//check return type-
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
