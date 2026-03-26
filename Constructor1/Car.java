package com.Constructor1;

public class Car {
	String name;
	int modelYr;
	int engineCC;
	String clr;
	public Car(String name,int modelYr,int engineCC,String clr) {
		this.name=name;
		this.modelYr=modelYr;
		this.engineCC=engineCC;
		this.clr=clr;
	}
	public void display() {
		System.out.println("Car Information------------->");
		System.out.println("Car Name"+name);
		System.out.println("Car Model Year"+modelYr);
		System.out.println("Car Engine CC"+engineCC);
		System.out.println("Car Colour"+clr);
	}

}
