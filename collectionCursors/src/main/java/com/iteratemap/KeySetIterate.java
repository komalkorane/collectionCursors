package com.iteratemap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class KeySetIterate {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put(10, "AA");
		hm.put(20, "BB");
		hm.put(30, "CC");
		hm.put(40, "DD");

		Set set = hm.keySet();
		Iterator itr = set.iterator();

		while (itr.hasNext()) {

			Integer i = (Integer) itr.next();
			System.out.println("Keys " + i + " Values " + hm.get(i));
		}

	}

}
