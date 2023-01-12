package com.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterator {

	public static void main(String[] args) {

		Set s = new HashSet();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(null);
		s.add(50);
		s.add(40);
		System.out.println(s);
		
		Iterator itr = s.iterator();
//		for(Object obj : s) {
//			System.out.println(s);
//		}
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
