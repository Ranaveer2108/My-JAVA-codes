package com.collection;
import java.util.Scanner;
public class OrderApp {
          int billAmt;
         public OrderApp(int billAmt) {
        	 super();
        	 this.billAmt=billAmt;
         }
         void confirmOrder(int amt) throws AmountMisMatchException{
        	   if(billAmt==amt)
        		   System.out.println("Your Order is Confirmed");
        	   else 
        		   throw new AmountMisMatchException("Amount paid is not matching with actual bill");
         }
	public static void main(String[] args) {
		OrderApp order=new OrderApp(3000);
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Amount for Payment");
		int amt=sc.nextInt();
		try {
			order.confirmOrder(amt);	
		}
		catch(AmountMisMatchException e) {
			System.out.println(e);
		}
	}

}
