package com.tka;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] num = { 50, 40, 20, 10, 30 };
		Arrays.sort(num);

		System.out.println("Sorted Array");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}
}