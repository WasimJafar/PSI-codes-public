package com.sapient.day3;

public class AdditionOfTwoNumbers {

	protected int number1;
	protected int number2;
	protected int number3;

	public AdditionOfTwoNumbers() {
		this.number1 = 100;
		this.number2 = 200;
		System.out.println("I'm in zero argument constructor");
	}

	public AdditionOfTwoNumbers(int number1) {
		this.number1 = this.number2 = number1;
		System.out.println("I'm in one argument constructor");
	}

	public AdditionOfTwoNumbers(int number1, int number2) {
		this();
		this.number1 = number1;
		this.number2 = number2;
		System.out.println("I'm in two argument constructor");
		
	}

	public void setData(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public void setData(String number1, String number2) {
		this.number1 = Integer.parseInt(number1);
		this.number2 = Integer.parseInt(number2);
	}

	public void calculate() {
		this.number3 = this.number1 + this.number2;
	}
	
	public int getData() {
		return this.number3;
	}

	public void displayData() {
		System.out.println("Num1 = " + number1 + " Num2 = " + number2 + " Num3 = " + number3);
	}

	@Override
	public void finalize() throws Throwable {
		System.out.println("Inside garbage collector");
	}
}


class AdditionCal extends AdditionOfTwoNumbers {
	
	
	
	@Override
	public void calculate() {
		this.number3 = (this.number1 + this.number2) / 10 * 100;
	}
	
}
