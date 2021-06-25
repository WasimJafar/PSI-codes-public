package com.sapient.day3;

public class Demo2 {

	public static void main(String[] args) {

		AdditionOfTwoNumbers object = new AdditionOfTwoNumbers();

		object.setData(10, 20);
		object.calculate();
		object.displayData();

		object = new AdditionOfTwoNumbers(10, 20);
		object.displayData();

		object = null;
		System.gc();
		System.out.println("In main");

	}

}
