package com.LabActivity;

import java.util.ArrayList;

public class EvenSumArrayList {

	public static void main(String[] args) {
		ArrayList<Integer>num=new ArrayList<Integer>();
		num.add(26);
		num.add(36);
		num.add(226);
		num.add(27);
		num.add(29);
		num.add(21);
		num.add(292);
		num.add(261);
		num.add(234);
		num.add(216);
		System.out.println(num);
	int sum=0;
		for(int number:num) {
			if(number%2==0) {
				sum+=number;
			}
		}
		System.out.println("Sum of even numbers="+sum);	
	}

}
