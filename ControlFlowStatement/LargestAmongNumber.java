package com.controlflow;

public class LargestAmongNumber {
	public static void main(String[] args) {
		int a = 45, b = 15, c = 10;
		if (a > b && a > c) {
			System.out.println(a + ":This Number is greatest");
		} else if (b > c) {
			System.out.println(b + ":This number is Greatest");
		} else {
			System.out.println(c + ":This number is Greatest");

		}

	}

}
