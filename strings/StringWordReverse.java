package com.strings;

public class StringWordReverse {
   static void  reverse(String str) {
		String s="Ranu virat kohli 18";
		for(int i=str.length()-1;i>=0;i++) {
			s+=str.charAt(i);
			
		}
System.out.println("Reversed string is "+s);
	}
	public static void main(String[] args) {

	}

}
