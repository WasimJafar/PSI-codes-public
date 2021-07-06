package com.sapient.entity;

public class Custum {

	private String id;
	private String fname;
	private String marks;
	private String city;

	
	
	public Custum(String id, String fname, String marks, String city) {
		super();
		this.id = id;
		this.fname = fname;
		this.marks = marks;
		this.city = city;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Custum [id=" + id + ", fname=" + fname + ", marks=" + marks + ", city=" + city + "]";
	}
	
	
	

}
