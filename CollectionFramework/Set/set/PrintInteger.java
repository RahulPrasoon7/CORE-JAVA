package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class PrintInteger {
	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
//		for (Integer i : s) {
//			System.out.println(i + " ");

		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");

		}

	}
}
