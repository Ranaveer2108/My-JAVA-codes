package com.ajp;

import java.util.Scanner;

public class Results {
	int sub1,sub2,sub3,sub4;
	void findResult() {
		if(sub1>=35 && sub2>=35 && sub3>=35 && sub4>=35)
		{
			int total,avg;
			char g=0;
			total=sub1+sub2+sub3+sub4;
			avg=total/4;
			if(avg>=80)
				g='A';
			else if(avg>=60)
				g='B';
				else if(avg>=36)
					g='C';
			switch(g) {
			case 'A':System.out.println("Grade = A");
			break;
			case 'B':System.out.println("Grade=B");
			break;
			case 'C':System.out.println("Grade=C");
			break;
			default:System.out.println("error");
			}
		}
		else 
			System.out.println("student failed");
	}

	public static void main(String[] args) {
		System.out.println("Enter a 4 subjects marks");
		Scanner sc=new Scanner(System.in);
		Results result=new Results();
		result.sub1=sc.nextInt();
		result.sub2=sc.nextInt();
		result.sub3=sc.nextInt();
		result.sub4=sc.nextInt();

		result.findResult();

	}

}
