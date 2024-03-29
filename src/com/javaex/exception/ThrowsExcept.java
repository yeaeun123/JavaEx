package com.javaex.exception;

import java.io.IOException;

// 사용자 정의 예외 
class CustomArithException extends ArithmeticException {
	// 필드
	private int num1;
	private int num2;

	// 생성자
	public CustomArithException(String message, int num1, int num2) {
		super(message);
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

}

public class ThrowsExcept {

	public void executeExcept() throws IOException { // 선언부에 예외를 던질 것을 알림
		System.out.println("강제 예외 발생! ");
		// 외부로 예외 던지기 (throw)
		throw new IOException("강제 예외! ");
		// IOException은 대표적인 CheckedException,
		// CheckedException을 throw 할 때는 해당 메서드가 CheckedException을 던져준다는 점을
		// 외부의 메서드에게 알려줘야 한다.
	}

	public void executeRuntimeException() {
		// 런타임 익셉션 -> 실행 타임에서만 확인되는 메서드
		// 예외 처리 없이도 컴파일은 되지만,
		// 예외 처리를 거쳐야 안정성이 보장된다!
		// throws 를 명시하지 않는다.
		System.out.println("런타임 익셉션");
		throw new RuntimeException("런타임 익셉션");
	}

	// 두 개의 숫자를 나누는 코드
	public double divide(int num1, int num2) {
		// 예외 발생 시 보다 구체적인 예외로 변환한 후
		// 예외 상황의 정보를 추가해서 예외를 반환하는 것이 좋다.
		double result = 0;
		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			CustomArithException cae = new CustomArithException("사용자 정의 Exception", num1, num2);
			// 전환된 사용자 정의 예외를 throw
			throw cae;
		}
		return result;
	}
}
