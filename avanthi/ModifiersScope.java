package com.avanthi;

public class ModifiersScope {

	public static void main(String[] args) {
		Car cr=new Car();
		cr.capacity=100;
		cr.name="Fortuner";
		cr.speed=120;
		cr.setMillage(20);
		System.out.println("Car Details:"+cr.capacity+","+cr.name+","+cr.speed+","+cr.setMillage);

	}

}
