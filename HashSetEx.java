package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
	  Set<Integer>set=new HashSet<Integer>();
	  set.add(24);
	  set.add(34);
	  set.add(null);
	  set.add(35);
	  set.add(34);
	  set.add(44);
	  System.out.println(set);
	  //LinkedHashSet
	  Set<Integer>lset=new LinkedHashSet<>();
	  lset.add(14);
	  lset.add(24);
	  lset.add(34);
	  lset.add(04);
	  lset.add(null);
	  lset.add(null);
	  lset.add(64); 
	  lset.add(14);
	  System.out.println(lset);
	}

}
