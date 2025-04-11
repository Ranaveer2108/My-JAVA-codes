package com.avanthi;

public class EmpManagementSystem {

	public static void main(String[] args) {
		PermanentEmployee pemp=new PermanentEmployee();
		pemp.basic_pay=4000;
		pemp.pf=5000;
		pemp.dA=3000;
		pemp.tA=3000;
		pemp.calc_sal();
	}

}
