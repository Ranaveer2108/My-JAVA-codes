package com.strings;
import java.util.StringTokenizer;
public class StringTokenizerDemo {

	public static void main(String[] args) {
		StringTokenizer str=new StringTokenizer("Welcome,to,Java,programming",",", true);//by taking boolean it count comos also
		System.out.println(str);
		System.out.println(str.countTokens());
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
	}

}
