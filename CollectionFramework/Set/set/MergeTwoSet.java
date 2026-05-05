package com.set;

import java.util.HashSet;

public class MergeTwoSet {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		HashSet set2 = new HashSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		set2.addAll(set);
		
		System.out.println(set2);
	}
}


