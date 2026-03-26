package com.Constructor1;

public class MyPortfolio {
	String name;
	int age;
	long mobNo;
	long aadharCard;
	String panCard;
	String city;

	public MyPortfolio(String name, int age, long mobNo, long aadharCard, String panCard, String city) {
		this.name = name;
		this.age = age;
		this.aadharCard = aadharCard;
		this.panCard = panCard;
		this.city = city;
	}

	public void display() {
		System.out.println("My Portfolio------------------");
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
		System.out.println("Aadhar Card Number = " + aadharCard);
		System.out.println("PanCard Number = " + panCard);
		System.out.println("City = " + city);

	}
}
