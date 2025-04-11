package com.avanthi;

public abstract class Cars {
	int speed;
	String company;
	abstract void display_details();
	public void getinfo() {
		System.out.println("speed="+speed+"company:"+company);
	}

}
