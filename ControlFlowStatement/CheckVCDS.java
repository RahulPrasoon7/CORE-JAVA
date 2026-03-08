package com.controlflow;

public class CheckVCDS {
	public static void main(String[] args) {
		char a='s';

		if (a >= '0' && a <= '9') {
			System.out.println("It is a Digit ");
		} else if (a == '@' || a == '#' || a == '$') {
			System.out.println("This is a Special Symbol");
		} else if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
			System.out.println("Character is Vowel");
		} else {
			System.out.println("it is Consonant");
		}
	}

}
