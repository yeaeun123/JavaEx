package com.javaex.exception;

public class NullPointExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
		
		String str = new String("hello");
		
		str = null;
		
		try {	//예외 발생 가능영역
		System.out.println(str.toString());
		}catch (NullPointerException e) {
			System.err.println("널 입니다.");
		}finally {
			System.out.println("예외처리 종료");
		}

	}

}
