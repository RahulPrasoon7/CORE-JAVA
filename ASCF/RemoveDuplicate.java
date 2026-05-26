package com.tka;

import java.util.HashSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String str = "java is easy and java is powerful";
		String[] words = str.split(" ");
		HashSet<String> set = new HashSet<>();
		for (String s : words) {
			set.add(s);
		}
		System.out.println(set);
	}

}
