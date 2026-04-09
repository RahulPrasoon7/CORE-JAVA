package com.practice;

public class Electronic extends Product implements Discount {
  
	private double tv;
	@Override
	public void discount() {
		int discount=(int) (tv*10/100);
		System.out.println("The discounted Price is = "+discount);		
	}

	@Override
	public void getPrice() {
		int tv=50000;
	System.out.println("The Tv Price is= "+tv);
		
		
	}

}
