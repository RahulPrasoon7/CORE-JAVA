package com.practice;

public abstract class Bank {
	 private double balance;
	public abstract void calculateInterest(double balance ,int year);
	public void displayBalance() {
		System.out.println("This Is the Balance "+balance);
	}

}
