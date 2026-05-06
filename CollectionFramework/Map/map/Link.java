package com.map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Link {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(123, "Singh");
		map.put(23, "Rahul");
		map.put(321, "Prince");
		map.put(520, "Raj");
		// System.out.println(map.get(123));

		for (Entry<Integer, String> data : map.entrySet()) {
			System.out.println(data.getKey() + "-" + data.getValue());
		}
	}

}
