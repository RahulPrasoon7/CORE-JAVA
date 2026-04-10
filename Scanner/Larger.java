package com.tka;

import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.println("Enter First Number");
		a = sc.nextInt();
		System.out.println("Enter Second Number");
		b = sc.nextInt();
		System.out.println("Enter third Number");
		c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("The number is larger" + a);
			sc.nextInt();
		} else if (b > c) {
			System.out.println("The number is Larger" + b);

		} else {
			System.out.println("The Number is Larger" + c);
		}
	}

}
