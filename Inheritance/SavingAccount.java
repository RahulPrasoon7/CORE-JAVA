package com.inheritance;

public class SavingAccount extends BankAccount {
	float interestRate;

	public void addInterest() {
		System.out.println("Interest " + balance + "is" + interestRate + "%" + "\nInterest on account is:"
				+ (balance * interestRate / 100));

	}

}
