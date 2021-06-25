package com.sapient.day5;

public class Demo1 {

	public static void fun1(int x, int y, Calculate calculate) {
		System.out.println(calculate.cal(x, y));
	}

	public static void main(String[] args) {

		Calculate calculate = (a, b) -> (a + b);

		System.out.println(calculate.cal(10, 20));

		calculate = (a, b) -> (a - b);

		System.out.println(calculate.cal(10, 20));

		fun1(10, 20, (a, b) -> (a * b));

		
		
	}

}
