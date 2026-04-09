package com.practice;

public class Current extends Bank {
private double balance;
	@Override
	public void calculateInterest(double amount, int year) {
		double balance=((amount*7*year)/100);
		this.balance=balance;
		
	}
	public void displayBalance() {
		System.out.println("This Is the Balance "+balance);
	}

}
