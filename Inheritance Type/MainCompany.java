package com.mixInheritance;

public class MainCompany {
	public static void main(String[] args) {
		Company c=new Company();
		c.showDetails();
		System.out.println("-----------------");
		Manager m=new Manager();
		m.showDetails();
		}

}
