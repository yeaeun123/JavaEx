package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElsePractice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
				
				System.out.println("과목을 선택하세요\n(1.자바,2.c, 3.c++, 4.파이썬)");
				
				int subj = scanner.nextInt();
				if (subj ==1) {
					System.out.println("R101호 입니다");
				} else if (subj==2) {
					System.out.println("R202호 입니다");
				} else if (subj==3) {
					System.out.println("R303호 입니다");
				} else if (subj==4) {
					System.out.println("R404호 입니다");
				} else {
					System.out.println("상담원에게 문의하세요");
				}
		scanner.close();
		

	}

}
