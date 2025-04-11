package com.ajp;

public class CarDemo {

	public static void main(String[] args) {
		Car cr=new Car();
		cr.speed=250;
		
		CarDemo cad=new CarDemo();
		cad.name="BMW";
		cad.speed=300;
		cad.setMillage(25);
		System.out.println("Car Details:"+cr.capacity+","+cr.name+","+cr.speed+","+cr.setMillage);

	}

}
