package com.tka;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] num = { 10, 20, 20, 30, 40, 50, 50 };
		for (int i = 0; i < num.length; i++) {
			for (int j = 1; j < i; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
					
				}

			}
			
			}
		}
	}


