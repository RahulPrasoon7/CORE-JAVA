package com.mixInheritance;

public class MainLibrary {
	public static void main(String[] args) {
		Library l=new Library();
		l.showDetails();
		System.out.println("---------------------");
		Section s=new Section();
		s.showDetails();
		System.out.println("---------------------");
		Book b=new Book();
		b.showDetails();
	}

}
