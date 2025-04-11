package com.avanthi;

public class FactorialNum {
  int factorial(int num) {
	  int fact=1;
	  while(num>=1) {
		  fact=fact*num;
		  num--;
	  }
	  return fact;
  }
  public static void main(String[] args) {
	FactorialNum f=new FactorialNum();
	int result=f.factorial(6);
	System.out.println(result);
}
}
