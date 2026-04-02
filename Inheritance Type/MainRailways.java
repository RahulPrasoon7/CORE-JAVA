package com.mixInheritance;

public class MainRailways {
	public static void main(String[] args) {
		Train t = new Train();
		t.showDetails();
		System.out.println("----------------------");
		Passenger p = new Passenger();
		p.showDetails();
		System.out.println("-----------------");
		Ticket t1 = new Ticket();
		t1.showDetails();
	}

}
