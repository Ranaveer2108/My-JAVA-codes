package com.strings;

public class StringBuilderDemo {
public static void main(String[] args) {
	StringBuilder stb=new StringBuilder(50);
	stb.append("java ");
	System.out.println(stb.indexOf("rogramming"));//programming is not present so it returns o/p is -1
	System.out.println(stb.capacity());
	System.out.println(stb);
}
}

 