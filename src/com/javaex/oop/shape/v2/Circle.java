package com.javaex.oop.shape.v2;

// 인터페이스 내의 모든 추상 메서드는 반드시 구현해야한다. implements
public class Circle extends Shape implements Drawable {
	//필드
	private double radius;
	
	//생성자
	public Circle(int x, int y, double radius) {
		// 부모 생성자 호출
		super(x, y);
		this.radius = radius;
	}
	
	// 부모가 선언한 추상메서드는 반드시 구현해야한다.
	@Override
	public void draw() {
		System.out.printf("원 [x=%d, y=%d, r=%f, area=%f]을 그렸습니다.%n", 
				x, y, radius, area());
		
	}
	
	@Override
	public double area() {
		double area = Math.PI * Math.pow(radius, 2);	//pow 파워(두번 곱하기)
		return area;
		
	}
	

}
