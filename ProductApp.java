package com.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductApp {

	public static  void main(String[] args) {
	List<Product> productList=new ArrayList<Product>();
	Product p1=new Product(121 ,"Ac" ,60000 ,"Electronics");
	Product p2=new Product(521 ,"TV" ,15000 ,"Electronics");
	Product p3=new Product(421 ,"Fridge ",50000 ,"Electronics");
	Product p4=new Product(321 ,"Tshirt" ,2000 ,"Fashion");
	Product p5=new Product(221 ,"shirt" ,3000 ,"Fashion");
	     
	    productList.add(p1);
	    productList.add(p2);
	    productList.add(p3);
	    productList.add(p4);
	    productList.add(p5);
	    productList.add(new Product(201 ,"Table" ,25000 ,"Home Appliances"));
	    
	    for(Product p:productList)
	    System.out.println(p);
	    
	Collections.sort(productList);
System.out.println("After sorting: ");
for(Product p:productList)
	System.out.println(p);
	}

}
