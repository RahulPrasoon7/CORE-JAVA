package com.tka;

import java.util.Scanner;

public class Check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter your Number");
		a = sc.nextInt();
		if (a > 0) {
			System.out.println("The number is Positive");
		} else if (a < 0) {
			System.out.println("The Number is negative");

		} else {
			System.out.println("The Number is zero");
		}
	}

}
