package com.Constructor1;

public class Employee {
	int empId;
	String name;
	double salary;
	String department;

	public Employee(int empId, String name, double salary, String department) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.department = department;

	}

	public void display() {
		System.out.println("Employee Information-------------");
		System.out.println("Employee ID=" + empId);
		System.out.println("Employee Name=" + name);
		System.out.println("Employee Salary=" + salary);
		System.out.println("Employee Department=" + department);
	}
}
