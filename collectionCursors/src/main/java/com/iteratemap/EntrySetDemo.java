package com.iteratemap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntrySetDemo {

	public static void main(String[] args) {

		HashMap<String,Integer> hm = new HashMap();
		hm.put("AA", 10);
		hm.put("BB", 20);
		hm.put("CC", 30);
		hm.put("DD", 40);

		System.out.println(hm);
		Set s=hm.entrySet();
		Iterator itr=s.iterator();

		while(itr.hasNext()){
			
			Map.Entry<String, Integer> m=(Map.Entry<String, Integer>)itr.next();
			if(m.getKey()=="AA")
				m.setValue(55); 
			
			System.out.println("Keys "+m.getKey()+" Values "+m.getValue()); 
		}
		
	}

}
