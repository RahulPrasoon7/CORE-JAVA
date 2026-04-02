package com.mixInheritance;

public class MainUniversity {
	public static void main(String[] args) {
		University u = new University();
		u.showDetails();
		System.out.println("---------------------");
		Student s = new Student();
		s.showDetails();
		System.out.println("----------------------");
		Professor p = new Professor();
		p.showDetails();
		System.out.println("---------------------");
		Staff s1 = new Staff();
		s1.showDetails();

	}

}
