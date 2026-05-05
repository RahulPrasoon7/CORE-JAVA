package com.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Sort {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(208);
		set.add(3000);
		set.add(40);
		set.add(10);
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + " ");
		}
	}

}
