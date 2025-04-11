package com.LabActivity;

public abstract class Vaccine {
  int age;
  String nationality;
  public Vaccine(int age, String nationality) {
	  this.age=age;
	  this.nationality=nationality;
  }
    public void firstDose() {
    	if("Indian".equals(nationality) && age>= 18) {
    		System.out.println("you are eligible for first dose");
    		System.out.println("You need to pay 250 Rs for the first dose.");
    	}
    	else System.out.println("you are not eligibl for first dose");
    	
    }
    public void secondDose(boolean firstDoseTaken) {
    	if(firstDoseTaken) {
    		System.out.println("you are eligible for second dose");
    	}
    	else System.out.println("you need to take the first dose first before second dose");
    }
    public abstract void boosterDose();
}
