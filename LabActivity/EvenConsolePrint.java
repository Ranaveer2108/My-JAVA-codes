package com.LabActivity;
import java.util.Scanner;
public class EvenConsolePrint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
          int i;
		System.out.println("Enter an array size=");
		int n=sc.nextInt();
	int[] arr=new int[n];
		for( i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Even array=[");
		for(i=0;i<n;i++) {
		if(arr[i]%2==0) {
			System.out.print(arr[i]+" ");
		}
		}
		//System.out.print("]");
		int max=arr[0];
		int min=arr[0];
		for(i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println();
		System.out.print("maximum="+max);
		
		for(i=0;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println();
		System.out.print("minimum="+min);
	}
}

