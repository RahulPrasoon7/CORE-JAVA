package com.tka;

public class Search {
	public static void main(String[] args) {
		int[] num= {10,20,30,40,50};
		int se=50;
		for(int i=0;i<num.length;i++) {
			if(num[i]==se) {
				System.out.println("Element found"+i);
				
			}else {
				System.out.println("Not found"+i);
			}
		}
	}

}
