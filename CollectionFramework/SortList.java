package com.tka;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {
	public static void main(String[] args) {
		ArrayList<Integer> color = new ArrayList();
		color.add(10000);
		color.add(200);
		color.add(3000);
		color.add(5000);
		System.out.println("Before Sorting" + color);
		Collections.sort(color);
		for (int s : color) {
			System.out.println(s);

		}
	}
}