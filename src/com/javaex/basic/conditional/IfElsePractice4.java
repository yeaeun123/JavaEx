package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElsePractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in)
				;
		System.out.print("점수를 입력하세요.:");
		
		int score = scanner.nextInt();
		
		if (score % 3 ==0) {
			System.out.println("3의 배수입니다.");
		} else {
		System.out.println("3의 배수가 아닙니다.");
		}
		scanner.close();
		
		}
	}


