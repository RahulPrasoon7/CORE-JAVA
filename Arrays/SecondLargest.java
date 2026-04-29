package com.tka;

public class SecondLargest {
	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40, 50 };
		int largest = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > largest) {
				largest = num[i];
			}
		}
		//System.out.println(largest);
		int secondlargest = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++) {
			if (num[i] != largest && num[i] > secondlargest) {
				secondlargest = num[i];
				
			}
		}
		System.out.println(secondlargest);
		System.out.println(largest);
	}

}
