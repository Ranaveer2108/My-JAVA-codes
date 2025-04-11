package com.ajp;
import java.util.Scanner;
public class SwitchChar {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter a Vowel");
		Scanner sc=new Scanner(System.in);
		 ch=sc.next().charAt(0);
		 switch(ch) {
		 case 'a':System.out.println("Choosen value=a");
		        break;
		 case 'e':System.out.println("Choosen value=e");
	        break;
		 case 'i':System.out.println("Choosen value=i");
	        break;
		 case 'o':System.out.println("Choosen value=o");
	        break;
		 case 'u':System.out.println("Choosen value=u");
	        break;
		 default :System.out.println("Choosen character is consonant");
	      
		 }

	}

}
