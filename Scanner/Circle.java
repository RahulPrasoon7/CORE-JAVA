package com.tka;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float r;
		System.out.println("Enter Radius");
		r=sc.nextFloat();
		System.out.println("The area of Circle is "+(3.14*r*r));
	}

}
