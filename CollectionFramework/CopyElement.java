package com.tka;

import java.util.ArrayList;
import java.util.LinkedList;

public class CopyElement {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(3456);
		list.add(346);
		list.add(323456);
		list.add(3423456);
		list.add(3434556);
		list.add(3324456);
		list.add(33456);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(34234556);
		list1.add(323446);
		list1.add(323456);
		list1.add(3423456);
		list1.addAll(list);
		for (Integer r : list1) {
			System.out.println(r);
		}

	}
}