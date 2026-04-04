package com.practice;

public class CubeAndSquare {
	private int num;
	void setCube(int num) {
		num=num*num*num;
		this.num=num;
	}
	int getCube() {
		return num;
	}
	void setSquare(int num) {
		num=num*num;
		this.num=num;
	}
	int getSquare(){
		return num;
	}

}
