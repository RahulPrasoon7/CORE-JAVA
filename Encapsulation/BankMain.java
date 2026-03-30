package com.Encapsulation;

public class BankMain {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.setBalance(50000);
		b.setDeposite(50000);
		b.setWithdraw(50000);
		System.out.println("the current balance" + b.getBalance());
		System.out.println("the deposite balance" + b.getDeposite());
		System.out.println("the current balance after withdraw" + b.getWithdraw());
	}

}
