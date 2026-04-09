package com.practice;

public class Light implements SmartDevice {

	@Override
	public void turnOn() {
	System.out.println("The Light is On");	
	}

	@Override
	public void turnOff() {
		System.out.println("The Light is Off");
		
	}

}
