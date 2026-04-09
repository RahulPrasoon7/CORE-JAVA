package com.practice;

public class Car implements Vehicle {

	@Override
	public void start(String clr) {
		if(clr=="Green" ) {
			System.out.println("The Car is Start...!");
		}else {
			System.out.println("Invalid Output...!");
		}
		
	}

	@Override
	public void stop(String clr) {
		if(clr=="Red") {
			System.out.println("The car will be Stop");
		}else {
			System.out.println("Invalid Output...!");
		}
		
	}

	

}
