package com.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		String str="Hello";
		System.out.println(str);
		str.concat("Java");
		System.out.println(str);
		StringBuffer str1=new StringBuffer("Java programming language");
		System.out.println(str1);
		str1.append(" 2025");
		System.out.println(str1);
		str1.delete(17, 25);
		System.out.println(str1);
		str1.reverse();
		System.out.println(str1);
		str1.setCharAt(3, 'o');
		System.out.println(str1);
		str1.insert(0,"this ");
		System.out.println(str1);
		str.indexOf(str);
		System.out.println(str);
		String s=str1.toString();  // to append to the stringBuffer
		StringBuffer str2=new StringBuffer(s);
	}
 
}
