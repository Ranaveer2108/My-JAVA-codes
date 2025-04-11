package com.avanthi;
import java.util.Scanner;

public class GreaterOfTwo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=scanner.nextInt();
		System.out.println("Enter thw second number");
		int num2=scanner.nextInt();
		if(num1>num2)
			System.out.println("the greatest number is "+num1);
		else if(num2>num1)
			System.out.println("the greatest number is "+num2);
		else
			System.out.println("Both are equall");
		
		scanner.close();
	}

}
