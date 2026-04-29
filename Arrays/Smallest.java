package com.tka;

public class Smallest {
	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40, 50 };
		int smallest = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] < smallest) {
				smallest = num[i];
			}
		}
		// System.out.println(largest);
		int secondsmallest = Integer.MAX_VALUE;
		for (int i = 0; i < num.length; i++) {
			if (num[i] != smallest && num[i] < secondsmallest) {
				secondsmallest = num[i];

			}
		}
		System.out.println(secondsmallest);
		System.out.println(smallest);
	}

}
