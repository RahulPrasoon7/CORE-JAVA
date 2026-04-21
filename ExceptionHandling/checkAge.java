package com.tka;

public class checkAge {
	void Age(int age) {
		if(age<18){
			throw new IllegalArgumentException("Not Eligible");
		}

			System.out.println("Eligible");
		}
	}


