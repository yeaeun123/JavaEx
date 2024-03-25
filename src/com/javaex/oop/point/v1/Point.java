package com.javaex.oop.point.v1;

public class Point {
	
	//필드 (은닉)
	private int X;
	private int Y;
	
	// getters/setters
	public int getX() {
		return X;
	}
	public void setX(int X) {
		this.X= X;
	}
	public int getY() {
		return Y;

	}public void setY(int Y) {
		this.Y=Y;
		
	}
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", X,Y);
		
	}
	
	}


