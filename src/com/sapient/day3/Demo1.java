package com.sapient.day3;

import java.util.Scanner;

public class Demo1 {

	public void addTwoNumbers() {

		int number1 = Read.scanner.nextInt();
		int number2 = Read.scanner.nextInt();

		System.out.println(number1 + number2);

//		scanner.close();
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Java Project");

//		Demo1 object = new Demo1();
//		object.addTwoNumbers();

		AdditionOfTwoNumbers object = new AdditionOfTwoNumbers();

		int num1 = Read.scanner.nextInt();
		int num2 = Read.scanner.nextInt();

		object.setData(num1, num2);

//		object.updateNumber();

		System.out.println(object.getData());

		// for Strings
		AdditionOfTwoNumbers object1 = new AdditionOfTwoNumbers();

		String string1 = Read.scanner.next();
		String string2 = Read.scanner.next();

		object1.setData(string1, string2);

//		object1.updateNumber();

		System.out.println(object1.getData());

	}

}
