package com.sapient.day5;

public class EmployeeTO {

	private int empId;
	private String name;
	private int age;

	public EmployeeTO(int empId, String name, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EmployeeTO [empId=" + empId + ", name=" + name + ", age=" + age + "]";
	}

	
	
	
}
