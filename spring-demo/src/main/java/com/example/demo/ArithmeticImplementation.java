package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ArithmeticImplementation implements IArithmetic {

	public Double add(Double a, Double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	public Double sub(Double a, Double b) {
		// TODO Auto-generated method stub
		return a- b;
	}

	public Double mul(Double a, Double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	public Double div(Double a, Double b) {
		// TODO Auto-generated method stub
		return a / b;
	}

	
}
