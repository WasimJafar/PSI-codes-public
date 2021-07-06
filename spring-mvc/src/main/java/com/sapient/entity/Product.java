package com.sapient.entity;

public class Product {

	private String name;
	private String brand;
	private String madeIn;
	private String price;
	
	public Product () {}
	
	public Product(String name, String brand, String madeIn, String price) {
		super();
		this.name = name;
		this.brand = brand;
		this.madeIn = madeIn;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMadeIn() {
		return madeIn;
	}
	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", brand=" + brand + ", madeIn=" + madeIn + ", price=" + price + "]";
	}
	
	

}
