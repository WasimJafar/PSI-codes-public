package com.sapient.day3;

public class CalculationUser {

	public static void main(String[] args) {

		Calculation object = new Addition(100, 50);
		
		object.compute();
		object.displayData();
	
		
	}

}

class Addition extends Calculation {

	public Addition(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public void compute() {
		this.res = this.num1 + this.num2;
	}
}

class Subtraction extends Calculation {

	public Subtraction(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public void compute() {
		this.res = this.num1 - this.num2;
	}
}

class Multiplication extends Calculation {

	public Multiplication(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public void compute() {
		this.res = this.num1 * this.num2;
	}
}

class Division extends Calculation {

	public Division(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public void compute() {
		this.res = this.num1 / this.num2;
	}
}