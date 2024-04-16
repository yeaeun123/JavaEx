package com.javaex.thread.ex01;

public class MainThread {
//메인쓰레드와 워킹쓰레드 뭐가 먼저 나올지 모름- 랜덤
	public static void main(String[] args) {
		// Working Thread 수행
		DigitThread thread = new DigitThread();
		thread.setName("DigitThhread");
		// thread시작
		// -> .start() 메서드 호출
		thread.start();
		
		
		// MainThread 로직
		// A ~ Z 까지 차례대로 출력
		for (char ch = 'A'; ch <='Z'; ch++) {
			System.out.println("MainThread: " + ch);
			
			// 쓰레드 실행 대기 
			try {
			Thread.sleep(300); //0.3초 대기(InterruptedException 예외처리필수checked)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
		System.out.println("메인쓰레드 종료");
		
	}

}
