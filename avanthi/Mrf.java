package com.avanthi;

public class Mrf implements Tyres{
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
	 System.out.println("Avg life time of the MRF=5years");
	 
 }
}
