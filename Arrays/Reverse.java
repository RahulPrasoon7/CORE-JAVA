package com.tka;

public class Reverse {
	public static void main(String[] args) {
		int[] num= {10,20,30,40,50};
		System.out.println("Reverse Array");
		for(int i=num.length-1;i>=0;i--) {
			System.out.println("reverse Array"+num[i]);
		}
	}

}
