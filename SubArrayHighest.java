package com.array;

import java.util.Arrays;

public class SubArrayHighest {

	public static void main(String[] args) {
		int[] array = {2,4,5,3,6,7,4,5,6};
	   int[] subarray=new int[5];
	  int i=2,j=0;
		while(i<=6){
			
		 //int[] subarray=Arrays.copyOfRange(array,2,7);
          subarray[j]=array[i];
            i++;
            j++;
           
          		}
		System.out.println(Arrays.toString(subarray));
		
		/*int first=0;
		int second=0;
		for(int a:subarray) {
			
			
			if(a>first) {
				second=first;
				first=a;
			}  
		
		System.out.println("the second highest is :"+second);
		System.out.println(first);*/
		int highest=0;
		for(int num:subarray) {
			if(num>highest) {
				highest=num;
			}
		
		}
		System.out.println("Highest number in subarray is="+highest);
	}

}
