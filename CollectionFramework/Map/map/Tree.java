package com.map;

import java.util.TreeMap;

public class Tree {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1230, "Rahul");
		map.put(123, "Prasoon");
		map.put(1230, "Rahul");
		map.put(1235, "Yash");
		map.put(130, "Sarang");
		System.out.println(map);

	}

}
