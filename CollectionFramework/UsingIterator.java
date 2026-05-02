package com.tka;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Orange");
		Iterator<String> i = list.iterator();
		System.out.println(list);
	}

}
