package com.set;

import java.util.LinkedHashSet;

public class FirstAndLast {
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();

		set.add(1);
		set.add("Ganesh");
		set.add(21);
		set.add(50000);
		set.add(81f);

		System.out.println("First element: " + set.getFirst());
		System.out.println("Last element: " + set.getLast());
	}
}
