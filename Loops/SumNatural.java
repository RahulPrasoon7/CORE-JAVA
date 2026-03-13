package com.loops;

public class SumNatural {
	public static void main(String[] args) {
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum = sum + i;
//
//		}
//		System.out.println("Sum=" + sum);
//		int sum = 0, i = 0;
//		while (i <= 10) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println("Sum="+sum);

		int sum = 0, i = 0;
		do {
			sum = sum + i;
			i++;
		} while (i <= 10);
		System.out.println("Sum=" + sum);
	}

}
