package com.tka;

public class Palindrome {
	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 20, 10 };
		int i = 0;
		int j = num.length - 1;
		while (i < j) {
			if (num[i] != num[j]) {
				System.out.println("IS Not Palindrome");
			}
			i++;
			j--;
		}
		System.out.println("is Palindrome");
	}

}
