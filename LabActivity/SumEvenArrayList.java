package com.LabActivity;

import java.util.ArrayList;
import java.util.List;

public class SumEvenArrayList {

	public static void main(String[] args) {
		List<Integer>alist=new ArrayList<Integer>();
		alist.add(25);
		alist.add(29);
		alist.add(26);
		alist.add(24);
		alist.add(23);
		alist.add(22);
		alist.add(20);
		System.out.println(alist);
		int sum=0;
		for(int number:alist) {
			if(number%2==0) {
				System.out.println(number);
			}
		}
		
	}

}
