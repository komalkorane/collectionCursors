package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListObject {

	public static void main(String[] args) {

		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add("Komal");
		al1.add(null);
		al1.add(10.5);
		
		ArrayList al2 = new ArrayList();
		al2.add(20);
		al2.add("Korane");
		al2.add(null);
		al2.add(11.5);
		
		ArrayList al = new ArrayList();
		al.add(al1);
		al.add(al2);
		System.out.println(al);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
