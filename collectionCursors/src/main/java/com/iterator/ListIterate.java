package com.iterator;

import java.util.*;

public class ListIterate {

	public static void main(String[] args) {

		List l = new ArrayList();
		l.add("AAA");
		l.add(10);
		l.add(null);
		l.add(10.5);
		System.out.println(l);
		
		Iterator itr = l.iterator();
//		for(Object obj : l) {
//		System.out.println(obj);
//	}
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

}
}
