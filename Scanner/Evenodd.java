package com.tka;

import java.util.Scanner;

public class Evenodd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter the Number");
		a=sc.nextInt();
		if(a%2==0) {
			System.out.println("The Number is even");
		}else {
			System.out.println("The Number is odd");
		}
	}

}
