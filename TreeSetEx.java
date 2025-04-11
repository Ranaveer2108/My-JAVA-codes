package com.collection;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer>tset=new TreeSet<Integer>();  //<---it is generic type
        tset.add(30);
        tset.add(40);
        tset.add(10);
       // tset.add(null);
        tset.add(20);
        tset.add(25);
        tset.add(30);
        tset.add(60);
        System.out.println(tset);
        int a=tset.first();
        System.out.println(a);
        NavigableSet<Integer> descendingSet= tset.descendingSet();
        System.out.println(descendingSet);
        Object[] array =tset.toArray();
        for(Object i:array) {
        	System.out.println(i);
        }
        TreeSet<Product> pset=new TreeSet<Product>();
        Product p1=new Product(121 ,"Ac" ,60000 ,"Electronics");
    	Product p2=new Product(521 ,"TV" ,15000 ,"Electronics");
    	Product p3=new Product(421 ,"Fridge ",50000 ,"Electronics");
    	Product p4=new Product(321 ,"Tshirt" ,2000 ,"Fashion");
    	Product p5=new Product(221 ,"shirt" ,3000 ,"Fashion");
    	pset.add(p1);
    	pset.add(p2);
    	pset.add(p3);
    	pset.add(p4);
    	pset.add(p5);
        System.out.println(pset);
	}

}
