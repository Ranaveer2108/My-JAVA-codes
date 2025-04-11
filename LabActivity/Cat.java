package com.LabActivity;
import java.util.Scanner;
public class Cat extends Animal {
	public void makeSound() {
		System.out.println("THe cat Makes the sound meow ! meoww");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Animal animal=new Animal();
		Cat cat=new Cat();
		Dog dog=new Dog();
		System.out.println("Choose Animal");
		System.out.println("1.Dog");
		System.out.println("2.Cat");
	int choice= sc.nextInt();
		
		switch(choice) {
		case 1:
		dog.makeSound();
		break;
		case 2:
			cat.makeSound();
			break;
			default:
				System.out.println("Invalid option");
			
		}
		sc.close();
	}
   
}
