package com.LabActivity;

public class PolymorpismAdd {
   public int add(int a, int b) {
	   return a+b;
   }
   public int add(int a, int b, int c) {
	   return a+b+c;
   }
   public double add(double a,double b) {
	   return a+b;
   }
   public int add(int[] numbers) {
       int sum = 0;
       for (int num : numbers) {
           sum += num;
       }
       return sum;
   }
   public double add(double[] numbers) {
	   double sum=0.0;
	   for(double num: numbers) {
		   sum+=num;
	   }
	   return sum;
   }
   public static void main(String[] args) {
	   PolymorpismAdd cal=new PolymorpismAdd();
	   int result1=cal.add(5, 8);
	   System.out.println("sum of two integers is :"+result1);
	   
	   int result2=cal.add(5, 8, 23);
	   System.out.println("sum of three integers is :"+result2);
	   
	   double result3=cal.add(23.5, result2);
	   System.out.println("sum of two doubles is :"+result3);
	   
	   int[] intArray = {1, 2, 3, 4, 5};
       System.out.println("Sum of integer array: " + cal.add(intArray));
       
       double[] doubleArray = {1.2, 3.3, 5.4, 7.5, 9.6};
       System.out.println("sum of double array: "+ cal.add(doubleArray));
}
}
