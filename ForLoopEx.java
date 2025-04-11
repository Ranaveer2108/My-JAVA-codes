package com.ajp;

public class ForLoopEx {
public static void main(String[] args) {
	int range=20;
	int sum=0;
for(int i=0;i<range;i++) {
	if(i%2==0) {
		sum+=i;
	}
	
}
System.out.println(sum);
}
}
