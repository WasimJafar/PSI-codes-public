package com.sapient.assignment1.problem1;

public class Multiplication extends Arithmetic {

	
	Multiplication() {
		
	}
	
	Multiplication(double num1 , double num2) {
		setData(num1, num2);
	}
	
	@Override
	public void calculate() {
		this.setNum3(this.getNum1() * this.getNum2());
	}
		
	
}
