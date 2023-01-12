package com.iteratemap;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class EnumerationDemo {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put(10, "AA");
		hm.put(20, "BB");
		hm.put(30, "CC");
		hm.put(40, "DD");

		Hashtable hash = new Hashtable(hm);

		Enumeration e = hash.elements();
		Enumeration e1 = hash.keys();

		while (e1.hasMoreElements()) {
			System.out.println("Key " + e1.nextElement() + " Values " + e.nextElement());

		}

	}

}
