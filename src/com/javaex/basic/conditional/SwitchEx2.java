package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx2 {
	//1, 3, 5, 7, 8, 10, 12:31일입니다.
	//4, 6, 9, 11: 30일입니다.
	//나머지(2월) :28일입니다.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월을 입력하세요.");
		
		int month = scanner.nextInt();
		String message;
		
		switch(month) {
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				message = "31일 입니다.";
				break;
			
			case 4 :
			case 6 :
			case 9 :
			case 11 :
				message = "30일 입니다.";
				break;
			
			case 2 :
				message = "28일 입니다.";
			break;
			default :
				message = "?";
				break;
		
		}
		
		System.out.println(month + "월은 " + message);
		scanner.close();
		
	}

}
