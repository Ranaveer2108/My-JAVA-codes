package com.avanthi;

public class WhileExample {
	static int nextterm(int limit) {
		int num=0;
		int nextterm=0;
		int firstterm=0;
		int secondterm=1;
		//calculate sum of numbers till the limit value
	while(num<=limit) {
		System.out.println(firstterm );
		 nextterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
			num++;
		}
		return nextterm;
	}

	public static void main(String[] args) {
       System.out.println("sum of fibononcii series= "+nextterm(10));
	}

}
