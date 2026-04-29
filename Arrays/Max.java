package com.tka;

public class Max {
	public static void main(String[] args) {

		int[] num = { 10, 25, 5, 40, 15 };
		int max = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("Maximum element = " + max);
	}
}

