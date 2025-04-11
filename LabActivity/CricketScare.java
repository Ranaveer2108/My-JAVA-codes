//write a program in Java to create a Map Interface where we can store the cricketer
//name in it along with his scores and search for the batsman name and display his score.

package com.LabActivity;


	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	public class CricketScare {
	    public static void main(String[] args) {
	       
	        Map<String, Integer> cricketerScare = new HashMap<>();
	        
	        
	        cricketerScare.put("Virat Kohli", 185);
	        cricketerScare.put("Rohit Sharma", 102);
	        cricketerScare.put("Steve Smith", 76);
	        cricketerScare.put("Joe Root", 90);
	        cricketerScare.put("Babar Azam", 95);
	        
	        // Taking user input to search for a cricketer
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the cricketer's name: ");
	        String name = scanner.nextLine();
	        
	        // Searching for the cricketer's score
	        if (cricketerScare.containsKey(name)) {
	            System.out.println(name + " scored " + cricketerScare.get(name) + " runs.");
	        } else {
	            System.out.println("Cricketer not found in records.");
	        }
	        
	        scanner.close();
	    }
	}


