package com.javaex.oop.point.v1;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point one =new Point();
		one.setX(5);
		one.setY(5);
		
		Point two = new Point();
		two.setX(10);
		two.setY(23);
		
		one.draw();
		two.draw();
	}

}
