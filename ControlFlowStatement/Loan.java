package com.controlflow;

public class Loan {
	public static void main(String[] args) {
		int age = 24;
		double salary = 30000;
		if (age >= 18) {

			System.out.println("The Person is Eligible For Getting Loan");
			if (salary > 45000) {
				System.out.println("Loan Approved");
			} else {
				System.out.println("Loan Not Approved");
			}
		} else {
			System.out.println("You are not Eligible");
		}
	}

}
