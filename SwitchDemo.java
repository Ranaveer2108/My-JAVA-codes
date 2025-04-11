package com.ajp;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter a single digit number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		switch(num) {
		case 0:System.out.println("choosen number=0");
		       break;
		case 1:System.out.println("choosen number=1");
	       break;
		case 2:System.out.println("choosen number=2");
	       break;
		case 3:System.out.println("choosen number=3");
	       break;
		case 4:System.out.println("choosen number=4");
	       break;
		case 5:System.out.println("choosen number=5");
	       break;
	       case 6:System.out.println("choosen number=6");
	       break;
	       case 7:System.out.println("choosen number=7");
	       break;
	       case 8:System.out.println("choosen number=8");
	       break;
	       case 9:System.out.println("choosen number=9");
	       break;
	       default:System.out.println("Choosen invalid");
		}

	}

}
