package com.iteratemap;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class KeyValuesIterate {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put("AA", 10);
		hm.put("BB", 20);
		hm.put("CC", 30);
		hm.put("DD", 40);

		System.out.println(hm);

		Set s = hm.keySet();
		Collection c = hm.values();
		Set s1 =new LinkedHashSet(c);
		Iterator<Integer> it = s1.iterator();

		Iterator itr = s.iterator();
		
		while (itr.hasNext()) {
			System.out.println("Keys " + itr.next() + " Values " + it.next());
		}

	}

}
