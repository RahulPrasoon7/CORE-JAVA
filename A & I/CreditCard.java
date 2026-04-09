package com.practice;

public class CreditCard implements Payment{

private double amount;	
	public void pay(double amount) {
		this.amount=amount;
		System.out.println("The Credit Card Amount"+ amount);
	}

}
