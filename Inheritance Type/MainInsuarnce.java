package com.mixInheritance;

public class MainInsuarnce {
	public static void main(String[] args) {
		Insurance i=new Insurance();
		i.showDetails();
		System.out.println("----------------");
		Health h=new Health();
		h.showDetails();
		System.out.println("------------------");
		FamilyHealth f=new FamilyHealth();
		f.showDetails();
		}
	

}
