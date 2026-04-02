package com.mixInheritance;

public class MainTransport {
	public static void main(String[] args) {
		Transport t=new Transport();
		t.showDetails();
		System.out.println("--------------");
		Bus b=new Bus();
		b.showDetails();
		System.out.println("---------------------");
		Metro m=new Metro();
		m.showDetails();
		System.out.println("-----------------");
		Auto a=new Auto();
		a.showDetails();
	}

}
