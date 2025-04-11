package com.ajp;

import java.util.Scanner;

public class PrimeForLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("given num "+num+" is prime");
		}
		else System.out.println("given number"+num+" is not prime");
			}

}
