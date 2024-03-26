package com.javaex.oop.staticmember;

//static 영역 활용
//단 하나의 인스턴스만 유지
	//new Singleton () -> x!! 실행되면 안됨
public class Singleton {
	private static Singleton instance
					= new Singleton();
	
	private Singleton(){
		//new 생성 불가		
	}
	
	public Singleton getInstance() {
		//유일한 인스턴스 반환
		return instance;
		
	}


	}


