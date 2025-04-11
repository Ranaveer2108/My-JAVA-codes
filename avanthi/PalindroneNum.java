package com.avanthi;

public class PalindroneNum {
 void palindrone(int num) {
	 int remainder,reverse=0,temp;
	 temp=num;
	 while(num>0) {
		 remainder=num%10;
		 reverse=reverse*10+remainder;
		 num=num/10;
	 }
	 if(reverse==temp) {
		 System.out.println("Given number is palindrone");
	 }
	 else
		 System.out.println("Not a palindrone number");
 }
	  public static void main(String[]args) {
		  PalindroneNum p=new PalindroneNum();
		  p.palindrone(1415142);
	  
 }
}
