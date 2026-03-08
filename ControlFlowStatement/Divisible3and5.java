package com.controlflow;

public class Divisible3and5 {
	public static void main(String[] args) {
		int a = 25;
		if (a % 3 == 0 && a % 5 == 0) {
			System.out.println("the Number is divisible by 5&3");
		} else {

			System.out.println("Number is not divisible by 5&3");
		}

	}
}