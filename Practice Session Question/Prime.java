package com.practice;

public class Prime {
	private int num, count = 0;

	void setPrime(int num) {
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}if(count==2) {
			this.num=num;
		}else {
			System.out.println("Not a Prime Number");
		}
		
		}
	int getPrime() {
		return num;
	}

}
