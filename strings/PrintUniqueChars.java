//write a programme to print the unique characters present in the string
//I/P=java    O/P=jv

package com.strings;

public class PrintUniqueChars {
	public static void unique(String str) {
		for(int i=0;i<str.length();i++) { 
			//boolean val=true;
			int count=0;
			for(int j=0;j<str.length();j++) {
				if(i!=j && str.charAt(i)==str.charAt(j))
					//val=false;
					count++;
			}
			if(count==0)
				System.out.println(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		String str="java";
		unique(str);
	}

}
