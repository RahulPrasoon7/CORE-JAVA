package com.Constructor1;

public class Student {
	String name;
	int age;
	String city;
	long mobNo;
	public Student(String name,int age,String city,long mobNo) {
		this.name=name;
		this.age=age;
		this.city=city;
		this.mobNo=mobNo;
		
	}
	public void display() {
		System.out.println("Student Information--------------");
		System.out.println("Student Name="+name);
		System.out.println("Student Age="+age);
		System.out.println("Student City="+city);
		System.out.println("Student Mobile No.="+mobNo); 
		
	}

}
