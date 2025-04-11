package com.collection;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(500070, "Hayathnagar");
		map.put(500054, "BNReddy");
		map.put(503416, "MEtpally");
		map.put(501545, "Ibrahimpatnam");
		map.put(500051, "LBnagar");
		map.put(null, null);
		System.out.println(map);
		map.putIfAbsent(500070, "Hayathnagar");
		System.out.println(map);
	
	}

}
