package com.inheritance;

public class Electronics extends Product {
	int warranty;

	public void showWarranty() {
		System.out.println("Warranty:" + warranty + "yrs");
	}

}
