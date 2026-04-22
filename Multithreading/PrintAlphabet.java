package com.tka;

public class PrintAlphabet extends Thread {
	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
			System.out.println(ch);
		}
	}

}
