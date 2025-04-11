package com.ajp;
import java.util.Scanner;
    public class Atmapp {
    	public static void main(String[] args) {
           int balance=50000, withdraw,deposit;
          Scanner sc=new Scanner(System.in);
           while(true)
           {
        	   System.out.println("AYTOMATED TELLER MACHINE(ATM)");
        	   System.out.println("Choose 1 for withdraw");
        	   System.out.println("Choose 2 for Deposit");
        	   System.out.println("Choose 3 for Check balance");
        	   System.out.println("Choose 4 for Exit");
        	   System.out.println("Choose the operation u want to perform");
        	   int n=sc.nextInt();
        	   switch(n){
        	   case 1:
        		   System.out.println("ENter money to withdraw");
        		   withdraw=sc.nextInt();
        		   if(balance>=withdraw) {
        			   balance=balance-withdraw;
        			   System.out.println("Collect your money");
        		   }
        		   else
        			   System.out.println("Insufficient balance");
        		   System.out.println("");
        		   break;
        		   
        	   case 2:
        		   System.out.println("ENter money to Deposit");
        		   deposit=sc.nextInt();
        		  balance=deposit+balance;
        		  System.out.println("your money has been successfully deposited");
        		   System.out.println("");
        		   break;

        	   case 3:
        		   System.out.println("Balance = "+balance);
        		   System.out.println("");
        		   break;
        	   case 4:
        		   System.exit(0);
        	   }
        		   
        	   }
           }
}
