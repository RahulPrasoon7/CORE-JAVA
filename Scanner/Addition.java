package com.tka;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number:");
		int a = sc.nextInt();
		System.out.println("Enter Second Number:");
		int b = sc.nextInt();

		int c = a + b;
		System.out.println("Addition = " + c);
	}
}
