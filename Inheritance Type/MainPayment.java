package com.mixInheritance;

public class MainPayment {
	public static void main(String[] args) {
		UpiPayment u=new UpiPayment();
		u.showDetails();
		System.out.println("------------");
		Payment p=new Payment();
		p.showDetails();
	}

}
