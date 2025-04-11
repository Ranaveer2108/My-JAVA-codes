package com.array;

public class ArrayIntro {

	public static void main(String[] args) {
		int sum=0;
		int i;
		int[] arr=new int[5];
		arr[0]=10;
		arr[1]=15;
		arr[2]=19;
		arr[3]=30;
		arr[4]=40;
		for( i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			sum=sum+arr[i];
			 
		}
		System.out.println("sum of array="+sum);
	}

}
