package com.javaex.oop.shape.v2;

//인터페이스 내의 모든 추상 메서드는 반드시 구현해야한다. implements
public class Rectangle extends Shape implements Drawable {
	//필드
	private int width;
	private int height;
	
	//생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;	
	}
	// 추상 메서드 구현
	@Override
	public double area() {
		return width * height;
	}

	@Override
	public void draw() {
		System.out.printf("사각형[x=%d, y=%d, w=%d, h=%d, area=%f]을 그렸습니다.%n", 
				x,y, width, height, area());
	}
}
