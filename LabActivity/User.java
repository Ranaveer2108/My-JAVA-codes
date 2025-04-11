package com.LabActivity;

public class User {
        int id;
        String name;
        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }
}
class Employee extends User {
    
    double salary;
    public Employee(int id, String name, double salary) {
        // Call the superclass (User) constructor
        super(id, name);
        this.salary = salary;
    }
    public double calculateAnnualSalary() {
        return salary * 12; 
    }
    }
  