package com.javaex.oop.point.v2;

public class PointApp {

	public static void main(String[] args) {
	

//		Point one =new Point();
//		one.setX(5);
//		one.setY(5);
//		
//		Point two = new Point();
//		two.setX(10);
//		two.setY(23);
		
		Point one = new Point(5, 5);
		Point two = new Point(10, 23);
		
		
		one.draw();
		two.draw();
	}

}
