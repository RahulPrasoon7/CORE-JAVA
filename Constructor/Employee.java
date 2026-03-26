package com.constructor;

public class Employee {
	double salary = 50000;

	public Employee(String name, int empId, double salary) {
		System.out.println("Employee Information---->");
		System.out.println("Employee Name" + name);
		System.out.println("Employee Id" + empId);
		System.out.println("Emplyee Salary" + salary);
		System.out.println("Actual Salary" + Bonous());
	}

	public double Bonous() {
		double Bonous = 5000;
		return salary + Bonous;

	}

}
