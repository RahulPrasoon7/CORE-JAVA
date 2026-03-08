package com.controlflow;

public class ElectricityBill {
	public static void main(String[] args) {
		int units = 205;
		if (units >= 0 && units <= 100) {
			System.out.println("The units cost is 5 Rupee per unit,Total Bill:" + (units * 5));
		} else if (units >= 101 && units <= 200) {
			System.out.println("The unit cost is 7 Rupefe per unit,Total Bill:" + (units * 7));
		} else if (units > 200) {
			System.out.println("The unit cost is 10 Rupee per unit,Total Bill :" + (units * 10));
		}
	}

}
