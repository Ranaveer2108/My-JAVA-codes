package com.avanthi;

public class Bmw extends Cars{
void display_details(){
	System.out.println("Luxury");
}
void camera() {
	System.out.println("Back and front camera for driving support");
}
public static void main(String[] args) {
	Bmw bmw=new Bmw();
	bmw.company="BMW";
	bmw.speed=280;
	bmw.display_details();
	bmw.camera();
	bmw.getinfo();
	//Cars car=new Cars();
	
}
}
  