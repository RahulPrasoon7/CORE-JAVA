package com.tka;

public class Min {
	public static void main(String[] args) {

		int[] num = { 10, 25, 5, 40, 15 };
		int min = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("Minimum element = " + min);
	}
}
