package com.tka;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		ArrayList<Integer> color = new ArrayList();
		color.add(10000);
		color.add(3000);
		color.add(3000);
		color.add(5000);
		HashSet<Integer> s = new HashSet<Integer>(color);
		color = new ArrayList<Integer>(s);
		System.out.println(color);

	}
}