package com.collection;

import java.util.HashSet;

public class EmployeeMngmt {

	public static void main(String[] args) {
		Employeee emp1=new Employeee(1,"Ranu",25000);
		Employeee emp2=new Employeee(2,"panu",2000);
		Employeee emp3=new Employeee(3,"danu",22000);
		Employeee emp4=new Employeee(4,"manu",5000);
		Employeee emp5=new Employeee(5,"janu",15000);
		Employeee emp6=new Employeee(6,"sanu",35000);
		Employeee emp7=new Employeee(7,"tanu",85000);
		Employeee emp8=new Employeee(8,"Banu",45000);
		
		HashSet<Employeee> set=new HashSet<Employeee>();
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		HashSet<Employeee> set1=new HashSet<Employeee>();
		set1.add(emp5);
		set1.add(emp6);
		set1.add(emp7);
		set1.add(emp8);
		Department d1=new Department(123,"Developement",set);
		Department d2=new Department(124,"Accounts",set1);
		System.out.println(d1);
		System.out.println(d2);
	}

}
