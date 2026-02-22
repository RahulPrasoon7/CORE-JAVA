package com.operation;

public class Customer {
	public static void main(String[] args) {

		double Amount = 75000;
		double Grocery = 8000;

		System.out.println("Grocery Pay=" + Grocery);
		System.out.println("Total Amount in account =" + Amount);
		System.out.println("After pay the bill the amount= " + (Amount - Grocery));
		System.out.println("Actuall Available balance=" + (Amount - Grocery));
	}

}
