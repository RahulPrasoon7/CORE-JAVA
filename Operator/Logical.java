package com.operator;

public class Logical {
	public static void main(String[] args) {
		boolean check = true;

		System.out.println(10 > 45 && 20 < 9 || check && true);// true
		System.out.println((true) || 0 < 9 || check || 0 > 0);// true
		System.out.println(1 > 5 || 2 < 9 || false && 0 == 0);// true
		System.out.println(check && (20 < 9) || 45 != 0 && true);// true
	}

}
