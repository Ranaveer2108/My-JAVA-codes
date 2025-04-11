package com.LabActivity;
import java.util.Scanner;
public class MaximumTernaryOp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		double num1,num2;
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		
		double max=(num1 > num2) ? num1 :num2;
		System.out.println("The maximum of"+num1+" and"+num2+" is "+max);
	}

}
