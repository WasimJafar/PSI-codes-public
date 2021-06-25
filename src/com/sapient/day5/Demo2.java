package com.sapient.day5;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Demo2 {

	public void fun1(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is even");
		} else
			System.out.println(a + " is odd");
	}

	public void fun2(EmployeeTO employeeTO) {
		System.out.println(employeeTO);
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(50);
		list.add(40);
		list.add(30);
		list.add(25);

		Consumer<Integer> consumer = (a) -> {
			System.out.println(a);
		};

		consumer.accept(10);

		BiConsumer<Integer, String> biConsumer = (a, b) -> {
			System.out.println(a + " " + b);
		};

		biConsumer.accept(10, "user");

		// Predicate

		// method reference

		// static method
		list.forEach(System.out::println);

		System.out.println();

		// instance method
		list.forEach(consumer::accept);
//		list.forEach(consumer);

		System.out.println();

		Demo2 demo2 = new Demo2();

		list.forEach(demo2::fun1);

		System.out.println();

		List<EmployeeTO> employeeTOs = new ArrayList<>();

		for (int i = 1; i < 6; i++) {
			employeeTOs.add(new EmployeeTO(-i, "user" + (5 - i), 20 + i));
		}

		employeeTOs.forEach(System.out::println);
		// :: -> scope operators

		System.out.println();

		Consumer<EmployeeTO> consumer2 = (a) -> {
			System.out.println(a);
		};

		employeeTOs.forEach(consumer2::accept);

		// sort on the basis of user name
		System.out.println();

		//basis of empId -> ASC
		Collections.sort(employeeTOs, (a, b) -> (a.getEmpId() - b.getEmpId()));
		
		Collections.shuffle(employeeTOs);
		
		employeeTOs.forEach(consumer2::accept);

		System.out.println();
		Collections.sort(employeeTOs, (a, b) -> (a.getName().compareTo(b.getName())));

		employeeTOs.forEach(consumer2::accept);
		
		System.out.println();
		
		List<EmployeeTO> employeeTOs2 = employeeTOs.stream().filter((a) -> (a.getAge() > 22)
				).collect(Collectors.toList());
		
		
		employeeTOs2.forEach(consumer2::accept);
		
		//1) total of all ages
		//2) average of ages
		
		
//		List<EmployeeTO> employeeTOs3 = employeeTOs.stream().map((a) -> (a.getAge()) );
		
		int totalAge = employeeTOs.parallelStream().mapToInt(EmployeeTO::getAge).sum();
		
		Double average = employeeTOs.parallelStream().mapToDouble(EmployeeTO::getAge).average().orElse(-1);
		
		System.out.println("Total ages : " + totalAge);
		
		System.out.println("Average : " + average);
		
		System.out.println();
		List<Integer> ls = employeeTOs.stream().map(EmployeeTO::getAge).collect(Collectors.toList());
	
		
		List<String> names = employeeTOs.stream().map(EmployeeTO::getName).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
	}

}












