package com.LabActivity;
import java.util.Scanner;
public class Vaccination {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age=");
	int age=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter your nationality");
	String nationality=sc.nextLine();
	
	VaccinationSuccessfull user=new VaccinationSuccessfull(age,nationality);
	   user.firstDose();
	   System.out.println();
	   
	   boolean firstDoseTaken="Indian".equals(nationality) && age>=18;
	   
	   user.secondDose(firstDoseTaken);
	   System.out.println();
	   
       if(firstDoseTaken) {
    	   user.boosterDose();
       }
       else System.out.println("you need to take the first dose and second dose before the booster dose");
	   
	   sc.close();
	}

}
