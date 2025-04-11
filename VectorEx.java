package com.collection;
import java.util.Collections;
import java.util.Vector;
public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<Integer>();
		vector.add(25);
		vector.add(125);
		vector.add(20);
		vector.add(400);
		vector.add(250);
System.out.println(vector);
vector.addElement(100);
System.out.println(vector);
    Collections.sort(vector);
    System.out.println(vector);
    System.out.println(vector.firstElement());
    System.out.println(vector.lastIndexOf(vector));
    System.out.println(vector.lastElement());
	}

}
