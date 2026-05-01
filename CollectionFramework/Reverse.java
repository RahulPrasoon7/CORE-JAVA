package com.tka;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
	public static void main(String[] args) {
		ArrayList<String>name=new ArrayList<>();
		name.add("Rahul");
		name.add("Ganesh");
		name.add("Sarang");
		System.out.println("Original"+name);
		Collections.reverse(name);
		System.out.println("Reversed Name"+name);
	}

}
