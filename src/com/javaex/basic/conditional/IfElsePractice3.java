package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElsePractice3 {

	public static void main(String[] args) {
		// 점수 입력받아 등급 표시하는 프로그램
		//90점이상 "A",80~89점 B, 70~79점 C, 60~69점 D, 60점 미만 F
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		
		int score = scanner.nextInt();
		
		if (score >= 90) {
			System.out.print("A등급");
		} else if (score >= 80) {
			System.out.print("B등급");
		} else if (score >= 70) {
			System.out.print("C등급");
		} else if (score >= 60) {
			System.out.print("D등급");
		} else {
			System.out.print("F등급");
		}
		scanner.close();
		
	

	}

}
