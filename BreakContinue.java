package com.ajp;

public class BreakContinue {
	 void print3(int range) {
		for(int i=1;i<=range;i++) {
			if(i%3==0)
			continue;
			System.out.println(i+" ");
		}
	}

	public static void main(String[] args) {
		BreakContinue rr=new BreakContinue();
		rr.print3(67);
	}

}
