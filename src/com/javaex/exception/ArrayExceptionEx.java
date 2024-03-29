package com.javaex.exception;

public class ArrayExceptionEx {

	public static void main(String[] args) {

		int[] intArray = new int[] { 3, 6, 9 };

		try { // 예외사항 발생할 만한 곳에 try
			System.out.println(intArray[3]);

		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace(); 
			System.err.println("Error:" + e.getMessage());

		} finally {
			System.out.println("예외 처리 종료");
		}

	}

}
