package com.avanthi;

public class Ceat implements Tyres{
	int price;
	String brand;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void avgLifetime() {
		System.out.println("the life time of ceat tyres is = 4 years");
	}
}
