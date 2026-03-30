package com.Encapsulation;

public class MainPerson {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Rahul Prasoon");
		p.setAge(21);
		System.out.println("Person Name = " + p.getName());
		System.out.println("Person Age = " + p.getAge());

	}

}
