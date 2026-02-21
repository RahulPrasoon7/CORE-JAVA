package com.operation;

public class BankOperation {
	public static void main(String[] args) {
		double amount = 100000;
		double deposite = 50000;
		double totalAmount = 150000;
		System.out.println("Total Amount in Account" + (amount + deposite));
		double withrawAmount = 100000;
		System.out.println("Withraw Amount " + (totalAmount - withrawAmount));

	}

}
