package com.javaex.api.objectclass.ex3;

import com.javaex.oop.shape.v2.Circle;

public class CircleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a = new Circle(6, 4, 10);	//x, y, radius
		Circle b = new Circle(2, 12, 10);
		Circle c = new Circle(3, 3, 12);
		Circle d = c;
		
		System.out.println(a.equals(b));	
		System.out.println(a.equals(c));	
		System.out.println(a.equals(d));	
		System.out.println(d.equals(c));	

	}

}
