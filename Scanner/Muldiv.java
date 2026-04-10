package com.tka;

import java.util.Scanner;

public class Muldiv {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter First Number");
		a=sc.nextInt();
		System.out.println("Enter Second Number");
		b=sc.nextInt();
		int c=a*b;
		System.out.println("the Multiplication  a*b is "+c);
		int d=a/b;
		System.out.println("The Division is "+d);
	}

}
