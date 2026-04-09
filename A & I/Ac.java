package com.practice;

public class Ac implements SmartDevice {

	@Override
	public void turnOn() {
		System.out.println("The Ac is On");
		
	}

	@Override
	public void turnOff() {
		System.out.println("The Ac is Off");
	}

}
