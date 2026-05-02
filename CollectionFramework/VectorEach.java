package com.tka;

import java.util.Vector;

public class VectorEach {
	public static void main(String[] args) {
		Vector<Integer>num=new Vector<>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		for (Integer i : num) {
			System.out.println(i);
			
		}
	}
	

}
