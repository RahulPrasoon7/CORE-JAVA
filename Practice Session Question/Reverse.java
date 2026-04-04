package com.practice;

public class Reverse {
	private int num,reverse=0;
	void setReverseNumber(int num) {
		while(num!=0) {
			int digit=num%10;
			 reverse=reverse*10+digit;
			num=num/10;
		}
		this.reverse=reverse;
	}int  getReverseNumber(){
		return reverse;
	}
	

}
