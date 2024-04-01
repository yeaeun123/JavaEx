package com.javaex.api.objectclass.ex4;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle (int width, int height) {
		this.width = width;
		this.height = height;
		
	} //면적 구하는 메서드
	public int area() {
		return width * height;
	}
		//비교 로직: 면적이 같으면 동등한 사각형으로 판단
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Rectangle) {
				Rectangle other = (Rectangle)obj;
				return area() == other.area();
			}
			return super.equals(obj);
		}
		public String toString() {
			return "Rectangle [width =" + width +", height="+height+"]";
		
				
			}
		
	}

