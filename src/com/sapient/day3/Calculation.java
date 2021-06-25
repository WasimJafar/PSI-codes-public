package com.sapient.day3;

public abstract class Calculation {

	public int num1;
	public int num2;

	public double res;

	public Calculation(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public abstract void compute();

	public void displayData() {
		System.out.println("Res : " + res);
	}

}
