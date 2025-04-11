package com.collection;

public class BankAppThread {
     int balance;
     public void withdraw(int amt) {
    	 if(amt>balance)
    		try {
    			wait();
    		}catch(InterruptedException e) {
    			e.printStackTrace();
    		}
    	 else {
    		 balance=amt;
    	 }
     }
}
