


package org.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sample {
	public static void main(String[] args) {
		Map<String,Integer> m = new LinkedHashMap();
		
		m.put("tamil", 100);
		m.put("Englisg", 200);
		m.put("hindi", 300);
		
		System.out.println(m);
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
			
		}
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey());
			
		}
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getValue()    );
		}
	}

}
