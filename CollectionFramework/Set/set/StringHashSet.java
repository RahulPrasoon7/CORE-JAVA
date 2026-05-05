package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Rahul");
		set.add("Pranav");
		set.add("Ganesh");
		set.add("Sarang");
		set.add("Yash");

//		for (String s : set) {
//			System.out.println(s + " ");
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + " ");

		}
	}
}
