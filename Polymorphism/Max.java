package com.polymorphism;

public class Max {
	void max(int a, int b) {
		if (a > b) {
			System.out.println("The Max Number is" + a);
		} else {
			System.out.println("The Max Number is" + b);
		}
	}

	void max(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("The Max Number is" + a);
		} else if (b > a && b > c) {
			System.out.println("The Max Number is" + b);
		} else {
			System.out.println("The Max Number is" + c);
		}
	}

}
