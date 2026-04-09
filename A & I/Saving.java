package com.practice;

public class Saving extends Bank{
private double balance;
	
	public void calculateInterest(double amount, int year) {
		double balance=((amount*7*year)/100);
		this.balance=balance;
	}
		@Override
		public void displayBalance() {
			System.out.println("This Is the Balance "+balance);
		}

	

}
