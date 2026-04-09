package com.practice;

public class NetBanking implements Payment{

	private double amount;
	@Override
	public void pay(double amount) {
		this.amount=amount;
		System.out.println("The Amount is Net Banking "+amount);
	}

}
