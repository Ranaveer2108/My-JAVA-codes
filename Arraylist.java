package com.collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Arraylist {
public static void main(String[] args) {
	List list=new ArrayList();
	list.add("Ranu");
	list.add(123);
	list.add('s');
	list.add(3.14);
	list.add(123);
	list.add(null);
	System.out.println(list);
	list.add(1, "name");
	System.out.println(list);
	list.set(2, "NGO");
	System.out.println(list);
	list.remove(6);
	System.out.println(list);
	System.out.println("size=" +list.size());
	System.out.println(list.get(4));
	List list2=new LinkedList();
	list2.addAll(list);
	System.out.println(list2);
	
}
}
