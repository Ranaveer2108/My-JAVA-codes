package com.LabActivity;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int year=sc.nextInt();
		if((year%4==0 && year%100!=0 )|| year%400==0) {
			System.out.println("given "+year+" is a leap year");
		}
		else System.out.println("Given"+ year+" is not a leap year");
	}

}
