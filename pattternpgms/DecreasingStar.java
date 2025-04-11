package com.pattternpgms;
import java.util.Scanner;
public class DecreasingStar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENter the no.of rows");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=i;j<=n;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
sc.close();
}
}
