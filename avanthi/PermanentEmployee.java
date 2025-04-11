package com.avanthi;

abstract public class PermanentEmployee extends Employee {
  int tA,dA;
  void calc_sal() {
	  super.calc_sal();
	  int totalSalary=basic_pay+pf+tA+dA;
	  System.out.println("Permanent Emp total salary"+totalSalary );
  }
  void get() {
	  
  }
}
