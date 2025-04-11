package com.LabActivity;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		        Employee employee = new Employee(101, "John Doe", 5000.00);

		        // Calculate and display the annual salary
		        double annualSalary = employee.calculateAnnualSalary();
		        System.out.println("Employee ID: " + employee.id);
		        System.out.println("Employee Name: " + employee.name);
		        System.out.println("Employee Monthly Salary: $" + employee.salary);
		        System.out.println("Employee Annual Salary: $" + annualSalary);
		    }
		
	}


