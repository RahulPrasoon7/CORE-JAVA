package com.tka;

public abstract class FoodOrder {
	abstract void calculateBill();
	void printReciept() {
		System.out.println("Reciept Generated");
	}

}
