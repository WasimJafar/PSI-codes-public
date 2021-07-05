package com.example.demo;

public class User {

	private String name;
	private String address;

	public User() {
		
	}
	
	public User(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Demo1 [name=" + name + ", address=" + address + "]";
	}
	
	

}
