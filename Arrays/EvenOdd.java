package com.tka;

public class EvenOdd {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 45, 50 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("Even Number");
			} else {
				System.out.println("Odd Number");
			}
		}

	}
}