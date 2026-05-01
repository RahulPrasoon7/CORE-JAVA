package com.tka;

import java.util.ArrayList;

public class Collection {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(5);
		list.add(85);
		list.add(75);
		list.add(825);
		list.add(8585);
		list.add(85757);
		System.out.println(list);
		list.set(5, 7857);
		System.out.println("Adding the new element" + list);
		list.remove(2);
		System.out.println("After Removing" + list);
 

	}

}
