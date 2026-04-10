package com.tka;

import java.util.Scanner;

public class Info {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.next();
		System.out.println("Enter your Age:");
		int age=sc.nextInt();
		System.out.println("name is "+name);
		System.out.println("Age is"+age);
	}

}
