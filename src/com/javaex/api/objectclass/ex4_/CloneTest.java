package com.javaex.api.objectclass.ex4_;

//얕은 복제
public class CloneTest {

	public static void main(String[] args) {
		Scoreboard s1 = new Scoreboard(new int[] {10, 20, 30, 40});
		System.out.println("s1="+ s1);

		// 복제본 생성
		Scoreboard s2 = s1.getClone(); 	//Clone을 통해 다른 객체 생성
		System.out.println("s2="+ s2);
				
		System.out.println("s1 == s2 ?"+ (s1 == s2)); //다른 객체임
		
		
		s1.getScores()[0] = 50;	//내부 참조 필드의 값을 변경
		System.out.println("s2 =" +s2); //s2도 s1과 같은 참조주소 참조
		
		
		System.out.println("s1.scores == s2.cores ?"
							+ (s1.getScores() == s2.getScores()));
		// s1의scores, s2의 scores 는 같은 참조 주소인가?
		
		
		
	}

}
