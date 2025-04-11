package com.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<String,String>tmap=new TreeMap<>();
		tmap.put("India", "Delhi");
		tmap.put("Australia", "Canberra");
		tmap.put("Bangladesh", "Dhaka");
		tmap.put("Canada", "Ottawa");
		//tmap.put(null, "Dc");
		System.out.println(tmap);
		tmap.putIfAbsent("India", "DElhi");
		System.out.println(tmap);
	}

}
