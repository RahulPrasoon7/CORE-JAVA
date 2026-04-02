package com.mixInheritance;

public class Jio extends TelecomService {
	public static void main(String[] args) {
		Jio j=new Jio();
		j.speed=5;
		j.price=349;
		System.out.println("Speed is :"+j.speed);
		System.out.println("Price of Jio Recharge is :"+j.price);
		
	}

}
