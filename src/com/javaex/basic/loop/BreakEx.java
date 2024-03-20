package com.javaex.basic.loop;

public class BreakEx {
	// 6과 14로 모두 나누어 떨어지는 숫자 
	// 반복 횟수를 정확하게 알기 힘든 경우 -> while 효율적
	public static void main(String[] args) {
//		반복 체크변수
		int num = 1;
		
		while(true) {
			if (num % 6 == 0 && num % 14 == 0) {
				break;
				
			}
			num += 1;
		}
		System.out.println(num);
		}	

}
