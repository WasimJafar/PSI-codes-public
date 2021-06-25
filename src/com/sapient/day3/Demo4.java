package com.sapient.day3;

public class Demo4 {

	
	public static void main(String[] args) {
		
		Visibility visibility = new Visibility();
		
//		System.out.println(visibility.a1); private variable is not available
		System.out.println(visibility.a2);
		System.out.println(visibility.a3);
		System.out.println(visibility.a4);
		
//		visibility.fun1(); private function is not available
		visibility.fun2();
		visibility.fun3();
		visibility.fun4();
		
		
	}
}
