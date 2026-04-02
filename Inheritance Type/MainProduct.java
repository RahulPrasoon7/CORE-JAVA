package com.mixInheritance;

public class MainProduct {
	public static void main(String[] args) {
		Electronics e = new Electronics();
		e.showDetails();
		System.out.println("----------------");
		Mobile m = new Mobile();
		m.showDetails();

	}

}
