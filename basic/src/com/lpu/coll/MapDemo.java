package com.lpu.coll;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Amit", 34);
		map.put("Keerti", 49);
		map.put("Keerti", 49);
		map.put("Rajan", 22);
		map.put("Amit", 26);
		map.put("Aniket", 26);
		System.out.println(map);
		
		Integer marks = map.get("Amit");
		System.out.println(marks);
		
		Set<String> keySet = map.keySet();
		Collection<Integer> values = map.values(); // control 2 + L
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		map.remove("Amit");
		
		
	}

}
