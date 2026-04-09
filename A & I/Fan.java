package com.practice;

public class Fan implements SmartDevice{

	@Override
	public void turnOn() {
		System.out.println("The Fan is On");
		
	}

	@Override
	public void turnOff() {
		System.out.println("The fan Is Off");
		
	}

}
