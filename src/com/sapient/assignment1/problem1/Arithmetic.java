package com.sapient.assignment1.problem1;

public abstract class Arithmetic {

	private double num1;
	private double num2;
	private double num3;

	public Arithmetic() {

	}

	public Arithmetic(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void setData(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	
	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getNum3() {
		return num3;
	}

	public void setNum3(double num3) {
		this.num3 = num3;
	}

	public void display() {
		System.out.println("Result : " + num3);
	}
	
	public abstract void calculate();
	
	

}
