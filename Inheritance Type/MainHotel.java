package com.mixInheritance;

public class MainHotel {
	public static void main(String[] args) {
		Hotel h=new Hotel();
		h.showDetails();
		System.out.println("----------------");
		LuxuryHotel l=new LuxuryHotel();
		l.showDetails();
	}

}
