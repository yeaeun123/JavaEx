package com.javaex.api.objectclass.ex1;

public class LangClassTest {

	public static void main(String[] args) {
		// Object 클래스의 기본 메서드들
		Point p = new Point(10, 10);
		
		// Java 의 최상위 클래스는 Object -> 모든 기본 기능을 물려받음
		System.out.println(p.getClass().getName()); 	//클래스 이름 반환
		System.out.println(p.hashCode());				// hascCode ->객체 식별값,메모리주소
		System.out.println(p.toString());			//객체 내용을 문자열로 출력 기능
		System.out.println(p);
		
		// p 의 부모 객체 정보를 확인
		System.out.println(p.getClass()			// 현재 클래스 정보
				.getSuperclass()				// 부모 클래스 정보
				.getName());				

		Point p2 = new Point(10, 10);
		System.out.println(p2.hashCode());		//hashCode
		
		
	}

}
