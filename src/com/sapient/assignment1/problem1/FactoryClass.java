package com.sapient.assignment1.problem1;

public class FactoryClass {

	public static Arithmetic getFactoryObject(int choice, double num1, double num2) {

		if (choice == 1) {
			return new Addition(num1, num2);
		}

		else if (choice == 2) {
			return new Subtraction(num1, num2);
		}

		else if (choice == 3) {
			return new Multiplication(num1, num2);
		}

		else if (choice == 4) {
			return new Division(num1, num2);
		}

		else {
			return null;
		}

	}

	public static Arithmetic[] arithmetics = null;

	public static Arithmetic getFactoryObjectSingleton(int choice, double num1, double num2) {

		if (arithmetics == null) {
			initialiseStaticData();
		}

		arithmetics[choice].setData(num1, num2);

		return arithmetics[choice];
	}

	private static void initialiseStaticData() {

		arithmetics = new Arithmetic[5];
		arithmetics[1] = new Addition();
		arithmetics[2] = new Subtraction();
		arithmetics[3] = new Multiplication();
		arithmetics[4] = new Division();

	}

}
