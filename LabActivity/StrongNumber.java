package com.LabActivity;
import java.util.Scanner;
public class StrongNumber {
	public static int factorial(int n) {
		int fact=1;
			for(int i=1;i<=n;i++) {
			fact*=i;
			
			
		}
		return fact;
	}
	public static boolean isStrongNum(int num) {
		int originalnum=num;
		int sumOfFactorials=0;
		while(num>0) {
			int digit=num%10;
			 sumOfFactorials += factorial(digit); 
			 num /= 10;  
		}
		return sumOfFactorials==originalnum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number to check it is strong number or not");
           int num=sc.nextInt();
           if(isStrongNum(num)) {
        	   System.out.println(num+" is strong number");
           }
           else System.out.println(num+" is not a stong number");
           

	}

}
