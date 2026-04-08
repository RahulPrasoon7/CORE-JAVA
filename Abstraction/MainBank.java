package com.tka;

public class MainBank {
	public static void main(String[] args) {
//		Bank b=new Current();
//		
//		b.calculateInterest();
//		b.desposite();
//		System.out.println("------------------");
//		Bank r=new Saving();
//		r.calculateInterest();
//		r.desposite();
		
//		FoodOrder d= new DineInOrder();
//		d.calculateBill();
//		d.printReciept();
//		System.out.println("---------------------");
//		FoodOrder f= new OnlineOrder();
//		f.calculateBill();
//		f.printReciept();
		
//		Ride d=new MiniRide();
//		d.calculateFare();
//		d.startRide();
//		System.out.println("----------------");
//		Ride r=new PrimeRide();
//		r.calculateFare();
//		r.startRide();
		Employee e=new FullTime();
		e.calculateSalary();
		System.out.println("----------");
		Employee e1=new PartTime();
		e1.calculateSalary();
		
	}

}
