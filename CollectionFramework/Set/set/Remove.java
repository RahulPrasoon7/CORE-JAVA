package com.set;

import java.util.LinkedHashSet;

public class Remove {
	public static void main(String[] args) {
		LinkedHashSet s = new LinkedHashSet();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add("Rahul");
		s.remove("Rahul");
		System.out.println(s);
	}

}
