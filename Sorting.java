package com.array;

public class Sorting {
public static void sort(char[]array) {
	int n=array.length;
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if (array[i] > array[j ]) {
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
		}
}
	}
	
	}
	public static void printVowel(char[]array) {
		for(int i=0;i<array.length;i++) {
			if(array[i]=='a'||array[i]=='e'||array[i]=='i'||array[i]=='o'||array[i]=='u') {
				System.out.print(array[i]);
			}
		 
		}
	}
	public static void main(String[] args) {
		char[] charArray = {'d', 'a', 'c', 'b', 'e'};
		//System.out.println("Original charArray is :"+charArray);
sort(charArray);
for(char a:charArray)
	 System.out.print(a+" ");
System.out.println();
//System.out.println("the sorted array is "+a);
System.out.println("the vowels in array are :");
printVowel(charArray);

	}
}
