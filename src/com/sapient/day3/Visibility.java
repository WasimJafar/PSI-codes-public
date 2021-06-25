package com.sapient.day3;

public class Visibility {

	private int a1 = 10;
	int a2 = 20;
	protected int a3 = 30;
	public int a4 = 40;

	private void fun1() {
		System.out.println("I'm Fun1");
	}

	void fun2() {
		System.out.println("I'm Fun2");
	}

	protected void fun3() {
		System.out.println("I'm Fun3");
	}

	public void fun4() {
		System.out.println("I'm Fun4");
	}

}
