package com.javaex.api.objectclass.ex3;

public class Circle {
	//필드
	private int x;
	private int y;
	private int radius; //반지름 필드

	//생성자
	public Circle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	

	}
	// 동등성 조건 : 반지름이 같으면 동등하다.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle other = (Circle)obj;
			return radius == other.radius;
		}
		return super.equals(obj);

	}
	//문자열 출력 메서드
	@Override
	public String toString() {
			return "Circle[x = " + x +", y =" + y + ",radius =" + radius+"]";
		
	}
	
}
