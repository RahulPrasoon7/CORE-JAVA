package com.tka;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sub1, sub2, sub3, sub4, sub5, total, percentage;
		System.out.println("Enter Sub 1 Marks");
		sub1 = sc.nextFloat();
		System.out.println("Enter Sub2 MArks");
		sub2 = sc.nextFloat();
		System.out.println("Enter Sub3 Marks");
		sub3 = sc.nextFloat();
		System.out.println("Enter Sub 4 Marks");
		sub4 = sc.nextFloat();
		System.out.println("ENter sub5 marks");
		sub5 = sc.nextFloat();
		total = sub1 + sub2 + sub3 + sub4 + sub5;
		percentage = total / 500 * 100;
		System.out.println("Total Marks = " + total + "Total Percentage = " + percentage);

	}

}
