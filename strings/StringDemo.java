package com.strings;

public class StringDemo {
public static void main(String[] args) {
	String college="Avanthi";
	System.out.println(college.hashCode());
	 String college1="Avanthians";
	//System.out.println(college1.hashCode());*/
	for(int i=0;i<college.length();i++) 
		System.out.println(college.charAt(i));
	System.out.println(college.indexOf('v'));
	boolean endsWith=college.endsWith("college");
	System.out.println(endsWith);
String str=college.repeat(3);
System.out.println(str);
System.out.println(str.contains("van"));
System.out.println(college.trim());
System.out.println(college.concat(" Engineering"));
System.out.println(college1.compareTo(college));
System.out.println(college.equals(college1));
System.out.println(college.length());
}
}
