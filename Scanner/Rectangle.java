package com.tka;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l,b,area;
		System.out.println("Enter Length");
		l=sc.nextInt();
		System.out.println("Enter Breadth");
		b=sc.nextInt();
		area=l*b;
		System.out.println("The area of Rectangle is "+area);
		
	}

}
