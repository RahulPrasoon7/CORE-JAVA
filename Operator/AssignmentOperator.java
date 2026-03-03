package com.operator;

public class AssignmentOperator {
	public static void main(String[] args) {
		int i = 8;
		i--;
		// Post-decrement: decreases value of i by 1.
		// i = 7
		++i;
		// Pre-increment: increases value of i by 1.
		// i = 8
		System.out.println(i--);
		// Prints current value of i (8), then decreases it by 1.
		// Output: 8
		// i becomes 7
		i++;
		// Post-increment: increases i by 1.
		// i = 8
		System.out.println(i * 4);
		// Multiplies i by 4 and prints result.
		// 8 * 4 = 32
		// Output: 32

		++i;
		// Pre-increment: increases i by 1.
		// i = 9
		System.out.println(i -= 5);
		// i -= 5 means i = i - 5
		// 9 - 5 = 4
		// Prints 4
		// i = 4
		i++;
		// Post-increment
		// i = 5
		int b = i + 8;
		// New temp variable b declared.
		// b = 5 + 8 = 13
		// (b is not printed anywhere)
		System.out.println(i--);
		// Prints current i (5), then decreases it.
		// Output: 5
		// i = 4
		++i;
		// Pre-increment
		// i = 5
		i /= 4;
		// Divide i by 4 and assign back to i.
		// 5 / 4 = 1 (integer division)
		// i = 1

		System.out.println(i--);
		// Prints current i (1), then decreases it.
		// Output: 1
		// i = 0
		++i;
		// Pre-increment
		// i = 1
		System.out.println(i - 4);
		// Subtracts 4 from i and prints result.
		// 1 - 4 = -3
		// Output: -3
		System.out.println("______________________________");
		System.out.println(i);
		// i = 1
		// Output: 1
	}

}
