package com.avanthi;

import java.util.Scanner;

public class DoWhile {
	void sumOfEven(int range) {
  int num=0;
  int sum=0;
   do{
	   if(num%2==0);
	   sum+=num;
	   num++;
   } while(num<=range);
	   System.out.println("sum of even numbers= "+sum);
   
}
	public static void main(String[] args) {
		DoWhile ss=new DoWhile();
		 ss.sumOfEven(20);
	}
}