package com.listiterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args){

		LinkedList al = new LinkedList();
		al.add(10);
		al.add("Komal");
		al.add(null);
		al.add(10);
		al.add(50);
		System.out.println(al);
		
//		List list=Collections.unmodifiableList(al); 
//		System.out.println(list);
//		System.out.println(list.set(2, "Shree"));   // get UnsupportedOprationException
		
		List list=Collections.singletonList(al);
		System.out.println(list); 
		System.out.println(list.add("Shree"));
		
		System.out.println(al);
		System.out.println(list);
		
//		ListIterator list=al.listIterator(al.size());
//		while(list.hasPrevious()) {
//			int index=list.previousIndex();
//			System.out.println(list.previous()+" index "+index); 
//			if(index==1)
//				list.set("AAA");
//			
//		}
//		System.out.println(al);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ListIterator li = al.listIterator(al.size());
//		while(li.hasPrevious()) {
//			Integer i1=(Integer)li.previous();
//			if(i1==10) {
//				li.set(500);
//			}
//			System.out.println(i1);
//		}
//		System.out.println(al); 
	}

}
