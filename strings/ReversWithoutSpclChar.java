package com.strings;

public class ReversWithoutSpclChar {
	

		public static String spclChar(String str) {
			char[] arr = str.toCharArray();
			int i=0;
			int j=arr.length-1;
			while(i<j) {
				if(!Character.isLetterOrDigit(arr[i])) {
					i++;
				}
				else if(!Character.isLetterOrDigit(arr[j])) {
					j--;
				}
				else {
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					i++;
					j--;
				}
			}
			return new String(arr);
		}
		public static void main(String[] args) {
			String input="ranu@gmail.com";
			System.out.println(spclChar(input));
			
		}


}
