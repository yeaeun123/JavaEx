package com.javaex.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		//vector클래스를 상속받아 구현/쌓여있는 접시 쌓거나 가장 위 접시사용가능
		//스택 선언
		Stack<Integer> stack = new Stack<>();
		
		// 데이터 입력
		for (int i = 0; i < 10; i++) {
			stack.push(i);
			System.out.println("Stack: " + stack);
		}
		
		// 가장 마지막에 있는 데이터 확인만 함(가장 위)
		
		System.out.println("Peek: " + stack.peek());
		System.out.println("Stack: "+ stack);
		
		// 인출(뒤에서부터) /추출
		System.out.println("Pop: " + stack.pop());
		System.out.println("Stack: "+ stack);
		
//		while(true) {
//		System.out.println("Pop: " + stack.pop());
//		System.out.println("Stack: "+ stack);
//
//	}
		
		// Stack이 비어있는지 확인 해야한다.!!
		while(!stack.empty()) { // 비어있지 않으면 /not boolean
			System.out.println("Pop: " + stack.pop());
			System.out.println("Stack: "+ stack);
		}

	}

}
