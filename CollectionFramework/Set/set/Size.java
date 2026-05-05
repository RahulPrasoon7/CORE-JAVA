package com.set;

import java.util.HashSet;

public class Size {
	public static void main(String[] args) {
		HashSet s = new HashSet();
		s.add(1);
		s.add("Rahul");
		s.add(21);
		s.add(50000);
		s.add(81f);

		System.out.println("Size" + s.size());
	}

}
