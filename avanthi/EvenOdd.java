package com.avanthi;
import java.util.Scanner;
public class EvenOdd {
	
	void check(int num) {
	if(num%2==0)
		System.out.println(num+" is even");
	else
		System.out.println(num+" is odd");

	}
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scanner=new Scanner(System.in);
		int num;
		num=scanner.nextInt();
		EvenOdd evod=new EvenOdd();
		evod.check(num);
	}
}
