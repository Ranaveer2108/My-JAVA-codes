package com.collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class ClassEx {

	public static void main(String[] args) {
		List<Integer> empIdList=new ArrayList<Integer>();
		List<String> empNamesList=new ArrayList<String>();
		empIdList.add(1234);
		empIdList.add(2345);
		empIdList.add(3456);
		empIdList.add(4567);
		
		empNamesList.add("Ranu");
		empNamesList.add("Virat");
		empNamesList.add("King");
		empNamesList.add("Kohli");
		
		System.out.println(empIdList);
		System.out.println(empNamesList);
		
		Iterator<Integer> iterator=empIdList.iterator();
		while(iterator.hasNext());
		System.out.println(iterator.next());
		for(String str:empNamesList)
			System.out.println(str);
	}

}
