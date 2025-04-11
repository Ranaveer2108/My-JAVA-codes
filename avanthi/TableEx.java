package com.avanthi;
import java.util.Scanner;
public class TableEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a table number");
		int num=sc.nextInt();
			int i=1;
			while(i<=10) {
				System.out.println(num+"*"+i+"="+num*i);
				i++;
			}
		}

	}

