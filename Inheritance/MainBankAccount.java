package com.inheritance;

public class MainBankAccount {
	public static void main(String[] args) {
		SavingAccount s = new SavingAccount();
		s.name = "Rahul";
		s.balance = 100000;
		s.interestRate = 5;
		s.deposite(50000);
		s.withdraw(100000);
		s.addInterest();
	}

}
