package com.tka;

import java.util.ArrayList;

public class ElementExist {
	public static void main(String[] args) {
		ArrayList color = new ArrayList();
		color.add("Red");
		color.add("Blue");
		color.add("Green");
		color.add("Yellow");
		String search = "Yellow";
		if (color.contains("Yellow")) {
			System.out.println("Yes It Exist");
		} else {
			System.out.println("Does not Exist");
		}

	}
}