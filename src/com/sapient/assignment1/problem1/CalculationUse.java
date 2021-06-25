package com.sapient.assignment1.problem1;

import com.sapient.day3.Read;

public class CalculationUse {

	public static void main(String[] args) {

		System.out.println("<<<---:Enter choice:--->>>");
		System.out.println();
		System.out.println("1 for Addition");

		System.out.println("2 for Subtraction");
		System.out.println("3 for Multiplication");
		System.out.println("4 for Division");

		int choice = Read.scanner.nextInt();

		System.out.println("Enter num1 :");

		double num1 = Read.scanner.nextDouble();

		System.out.println("Enter num2 :");

		double num2 = Read.scanner.nextDouble();

		Arithmetic arithmetic = FactoryClass.getFactoryObjectSingleton(choice, num1, num2);

		try {
			arithmetic.calculate();
			arithmetic.display();

		} catch (Exception e) {
			System.out.println("Invalid choice");
		}

	}

}
