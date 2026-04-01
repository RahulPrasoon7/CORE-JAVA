package com.inheritance;

public class MainElectronics {
	public static void main(String[] args) {
		Electronics e = new Electronics();

		e.name = "Motorola50Fusion";
		e.price = 22000;
		e.warranty = 1;

		e.displayProduct();
		e.showWarranty();
	}

}
