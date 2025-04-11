package com.avanthi;

abstract public class Employee {
   int basic_pay;
          int pf;
   void calc_sal() {
	   
	   int totalSalary=basic_pay+pf;
	   System.out.println("Total Salary="+totalSalary);
   }
   void getEmp() {
	   System.out.println("Employee class");
   }
   abstract void getpf();
   abstract void getSal();
}
