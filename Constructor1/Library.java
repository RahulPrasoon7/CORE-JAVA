package com.Constructor1;

public class Library {
	String name;
	int id;
	int totalBooks;
	String city;
	int fee;

	public Library(String name, int id, int totalBooks, String city, int fee) {
		this.name = name;
		this.id = id;
		this.totalBooks = totalBooks;
		this.city = city;
		this.fee = fee;

	}

	public void display() {
		System.out.println("Library Information-----------------");
		System.out.println("Library Name=" + name);
		System.out.println("Library Id=" + id);
		System.out.println("Total Books=" + totalBooks);
		System.out.println("Located City=" + city);
		System.out.println("Libraray Monthly Fees=" + fee);
	}

}
