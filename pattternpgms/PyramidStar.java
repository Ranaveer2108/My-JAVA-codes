package com.pattternpgms;

import java.util.Scanner;

public class PyramidStar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the no.of rows");
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
        int j=n;
        while(j>=1) {
        	if(i>=j)
        	System.out.print(i+" ");
        	else System.out.print(" ");
        	j--;
        }
        System.out.println();
        i++;
		}
	}

}
