package com.tka;

public class CheckNumber {
	void checkName(int num) {
		if(num<0) {
			throw new IllegalArgumentException("Number cannot be negative");
		}
		System.out.println("Valid Number");
	}

}
