package com.tka;

public abstract class Employee {
	abstract void calculateSalary();

	void getEmployeeDetails(int age, String Name) {
		age = 25;
		Name = "Rahul";
		System.out.println("The Age is = " + age);
		System.out.println("The Name is = " + Name);

	}

}
