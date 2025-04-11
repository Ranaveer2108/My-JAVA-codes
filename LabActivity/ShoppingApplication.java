package com.LabActivity;

import java.util.Scanner;

public class ShoppingApplication {
	private static final String VALID_USERNAME = "user123";
    private static final String VALID_PASSWORD = "pass123";
    public static void AunthenticateUser(String username,String password)throws InvalidUserException{
    	if(!username.equals(VALID_USERNAME)|| !password.equals(VALID_PASSWORD)) {
    		
     throw new InvalidUserException("Invalid Username or Password! Please try again.");
    }
    	}
    public static void processPayment(double amount, String paymentMethod)throws PaymentFailedException{
    	if (amount <= 0) {
            throw new PaymentFailedException("Invalid payment amount. Payment must be greater than zero.");
    }if(!paymentMethod.equalsIgnoreCase("CreditCard") && !paymentMethod.equalsIgnoreCase("DebitCard")) {
        throw new PaymentFailedException("Payment method not supported. Please use CreditCard or DebitCard.");
    }
    System.out.println("payment of " + amount + " successful  ");
    	}
	public static void main(String[] args) throws PaymentFailedException {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter username");
			String username=sc.nextLine();
			System.out.println("Enter Password");
			String password=sc.nextLine();
			AunthenticateUser(username,password);
			System.out.println("Login Suuccessfull");
			System.out.println("Enter payment Amount");
			Double amount=sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter payment mode(creditcard/debitcard): ");
			String paymentmethod=sc.nextLine();
			processPayment(amount, paymentmethod);

            System.out.println("Thank you for shopping with us!");
		
		}catch(InvalidUserException e) {
			System.out.println("Authentication Error: " + e.getMessage());
		}catch(PaymentFailedException e) {
			System.out.println("Payment Error: " + e.getMessage());
		}catch(Exception e) {
			System.out.println("Unexpected Error: " + e.getMessage());
		}finally {
			System.out.println("Shopping Application Closed");
		}
		
	sc.close();
	}
	}


