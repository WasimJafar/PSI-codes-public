package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id //PK
	private String id;
	
	@Column(name = "fname")
	private String fname;
	
	@Column
	private String lname;
	
	@Column
	private String dob;
	
	@Column
	private String phoneNo;
	
	@Column
	private String area;

	public Student() {
		
	}
	
	public Student(String id, String fname, String lname, String dob, String phoneNo, String area) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.phoneNo = phoneNo;
		this.area = area;
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

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", phoneNo=" + phoneNo
				+ ", area=" + area + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Student obj1 = (Student) obj;
		return obj1.hashCode() == this.hashCode();
		
	}
	
	@Override
	public int hashCode() {
		return id.hashCode() + fname.hashCode() + lname.hashCode() + dob.hashCode() + phoneNo.hashCode() + area.hashCode();
//		return super.hashCode();
	}
}
