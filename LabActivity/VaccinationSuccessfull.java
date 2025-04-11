package com.LabActivity;

class VaccinationSuccessfull extends Vaccine {

    public VaccinationSuccessfull(int age, String nationality) {
        super(age, nationality);
    }
    
    public void boosterDose() {
        System.out.println("Congratulations! You are eligible for the booster dose now.");
    }
}
