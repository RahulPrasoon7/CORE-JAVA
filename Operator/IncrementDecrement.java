package com.operator;

public class IncrementDecrement {
	public static void main(String[] args) {
		int i = 90;
		i++;
		// Post increment → i becomes 91

		int j = i + 9;

		// j = 91 + 9 = 100

		System.out.println(i++);

		// Prints 91 (post increment)
		// Then i becomes 92

		--j;

		// Pre decrement → j becomes 99

		System.out.println(j * i);
		// 99 * 92 = 9108
		// Prints 9108

		i++;
		// i becomes 93

		--i;
		// i becomes 92

		System.out.println(--i);
		// Pre decrement → i becomes 91
		// Prints 91

		++i;
		// i becomes 92

		System.out.println(j + 3);
		// 99 + 3 = 102
		// Prints 102

		j--;
		// j becomes 98

		++j;
		// j becomes 99

		System.out.println(j + 7);
		// 99 + 7 = 106
		// Prints 106

		j--;
		// j becomes 98

		i++;
		// i becomes 93

		--i;
		// i becomes 92

		System.out.println(i + j);
		// 92 + 98 = 190
		// Prints 190

		System.out.println(i);
		// Prints 92

		System.out.println(j);
		// Prints 98
	}

}
