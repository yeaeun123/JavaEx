package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// Queue 선언
		// - Intergace (new로 객체화불가 linkedlist import)
		// - 실제 저장은 LinkedList 기능을 활용
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 0; i < 10; i++) {
			queue.offer(i); // 입력 (제공)
			System.out.println("Queue: " + queue);
	
		}
		
		System.out.println("Peek : " + queue.peek()); // 출력 방향의 데이터 확인
		System.out.println("Poll: " + queue.poll()); // 인출 후 삭제
		System.out.println("Queue: " + queue);
		
		// poll 할 때는 비어있는지 체크해야함
		while(!queue.isEmpty()) {	//큐가 비어있지 않은 동안 루프
			System.out.println("Poll : " + queue.poll());
			System.out.println("Queue: " + queue);
			
		}
	}

}
