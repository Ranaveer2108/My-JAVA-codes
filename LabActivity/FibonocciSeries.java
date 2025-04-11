package com.LabActivity;
import java.util.Scanner;
public class FibonocciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for to display the fibonocci series");
          int num=sc.nextInt();
          int a=0,b=1;
         System.out.println("the fibonocii series upto the"+num+"are");
          for(int i=1;i<=num;i++) {
        	  System.out.print(a+" ");
        	  int nextterm=a+b;
        	  a=b;
        	  b=nextterm;
          }
          sc.close();
	}

}
