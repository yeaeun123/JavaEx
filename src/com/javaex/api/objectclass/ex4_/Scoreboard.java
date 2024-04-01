package com.javaex.api.objectclass.ex4_;

import java.util.Arrays;

//clone 메서드 이용을 위해 Cloneable 인터페이스를 구현!
public class Scoreboard implements Cloneable {

	//필드
	private int scores[];
	
	// 생성자 =클래스 이름/ 반환타입없음
	public Scoreboard(int[] scores) {
		super();
		this.scores = scores;
	}
	
	//getters/setters

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	// 오버라이드
	@Override
	public String toString() {
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}
	
	// 복제본 생성 메서드
	public Scoreboard getClone() {
		// 새로운 인스턴스를 저장할 변수 선언
		Scoreboard clone = null; 
		
		try {
			clone = (Scoreboard)clone();
		}catch (CloneNotSupportedException e) {
			//예외 로그 출력
			e.printStackTrace();
		}
		return clone;
	}
	

	

}
