package com.pattternpgms;

import java.util.Scanner;

public class ButterflyStar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print("* ");
        	}
        	for(int j=i;j<n;j++) {
        		System.out.print("  ");
        	}
        	for(int j=i;j<n;j++) {
        		System.out.print("  ");
        	}
        	for(int j=1;j<=i;j++) {
        		System.out.print("* ");
        	}
        	
        	System.out.println();
        }
        for(int i=1;i<=n;i++) {
        	for(int j=i;j<=n;j++) {
        		System.out.print("* ");
        	}
        	for(int j=1;j<i;j++) {
        		System.out.print("  ");
        	}
        	for(int j=1;j<i;j++) {
        		System.out.print("  ");
        	}
        	for(int j=i;j<=n;j++) {
        		System.out.print("* ");
        	}
        	
        	System.out.println();
        }
	}

}
