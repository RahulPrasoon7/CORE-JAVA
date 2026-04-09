package com.practice;

public class Upi implements Payment {

	private double amount;
	@Override
	public void pay(double amount) {
		this.amount=amount;
		System.out.println("The Amount is Upi"+amount);
	}

}
