package com.Constructor1;

public class Login {
	String username;
	String password;
	long mobNo;
	int otp;

	public Login(String username, String password, long mobNo, int otp) {
		this.username = username;
		this.password = password;
		this.mobNo = mobNo;
		this.otp = otp;
	}

	public void display() {
		System.out.println("Login Method----------------------");
		System.out.println("Username =" + username);
		System.out.println("Password =" + password);
		System.out.println("Mobile Number =" + mobNo);
		System.out.println("Otp =" + otp);
	}

}
