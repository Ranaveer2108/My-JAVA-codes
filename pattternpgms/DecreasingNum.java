package com.pattternpgms;

import java.util.Scanner;

public class DecreasingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the no.of rows");
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
        int j=n;
        while(j>=i) {
        	System.out.print(i+" ");
        	j--;
        }
        System.out.println();
        i++;
		}

	}

}
