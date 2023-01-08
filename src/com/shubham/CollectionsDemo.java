package com.shubham;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Ajay");
		list.add("Sumit");
		list.add("Pranav");
		list.add("Mohan");
		
		System.out.println(list);
		
		for(String s:list)
		{
			System.out.println(s);
		}
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
