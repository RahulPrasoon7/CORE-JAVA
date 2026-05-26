package com.tka;

public class Vowels {
	public static void main(String[] args) {
		String str = "Programming";
		int count = 0;
		for (char c : str.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		System.out.println(count);
	}

}
