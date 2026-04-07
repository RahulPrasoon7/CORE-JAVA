package com.tka;

public class SimpleCalculator implements Calculator  {

	@Override
	public void add() {
	System.out.println("Addition Portion");	
	}

	@Override
	public void subtract() {
		System.out.println("Subtraction Portion");
		
	}

	@Override
	public void multiply() {
		System.out.println("Multipliction Portion");
		
	}

	@Override
	public void divide() {
		System.out.println("Division Portion");
		
	}
	

}
