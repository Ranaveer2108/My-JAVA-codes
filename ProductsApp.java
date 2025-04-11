package com.ajp;
import java.util.Scanner;
public class ProductsApp {

	public static void main(String[] args) {
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(true) {
			System.out.println(" choose 1 for laptop details");
			System.out.println("choose 2 for mobile details");
			System.out.println(" choose 3 for computer details");
			System.out.println(" choose 4 for Tv details");
			System.out.println("choose 5 for smartwarch details");
		System.out.println("choose 6  for exit");
		System.out.print("choose the option ");

		int choise=sc.nextInt();
		switch(choise) {
		case 1:
			System.out.println("Dell laptop   price=206000  i5 and 13 gen");
			System.out.println("Hp laptop   price=240000  i5 and 13 gen");
			System.out.println("macbook laptop   price=305000  i5 and 13 gen");

			break;
		case 2:
			System.out.println("vivo mobile price 30000 8GB RAM 216 ROM");
			System.out.println("iphone mobile price 160000 8GB RAM 216 ROM");
			System.out.println("Realme mobile price 19000 8GB RAM 216 ROM");
			break;
		case 3:
			System.out.println("ASUS    price=206000  i5 and 13 gen");
			System.out.println("DELL    price=240100  i5 and 13 gen");
			System.out.println("HP    price=305000  i5 and 13 gen");

			break;
		case 4:
			System.out.println("SONYMAX price 30000  TOUCHABLE ");
			System.out.println("ONEPLUS price 160000 SMART touch");
			System.out.println("LG  price 19000  ");
			break;
		case 5:
			System.out.println("Noise   price=4000 ");
			System.out.println("FireBoult  price=3670  ");
			System.out.println("fastrack   price=15000 ");
			

			break;
		case 6:
			System.exit(0);
			//default
		//	System.out.println("choosen wrong ");
		}
	}
	}
}
