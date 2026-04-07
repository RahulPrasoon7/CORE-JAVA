package com.tka;

public class EmployeeType implements Employee  {

	@Override
	public void calculateSalary() {
		System.out.println("This is used to Calculate FullTimeSalary");
		System.out.println("This is used to calculate PartTimeEmployee");
	}
	
}
