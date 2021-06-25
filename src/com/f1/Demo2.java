package com.f1;

import com.sapient.day3.Visibility;

public class Demo2 extends Visibility {

	public static void main(String[] args) {

	}

	public void test() {
		Visibility visibility = new Visibility();

//		System.out.println(a1); //private variable is not available

//		Only public members are visible
//		System.out.println(a2); 
		System.out.println(a3);
		System.out.println(a4);

//		fun1(); //private function is not available
//		fun2();//
		fun3();
		fun4();
	}
}
