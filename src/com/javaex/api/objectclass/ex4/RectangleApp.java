package com.javaex.api.objectclass.ex4;

public class RectangleApp {

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(6, 4);
		Rectangle b = new Rectangle(2, 12);
		Rectangle c = new Rectangle(3, 3);
		Rectangle d = c;
		
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(c.equals(d));
		System.out.println(d.equals(c));

	}

}
