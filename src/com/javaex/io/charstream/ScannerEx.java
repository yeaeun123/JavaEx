package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx { //원본파일 rootPath로 읽어오기
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath +"thieves.txt";
	
	public static void main(String[] args) {
		// 입력 소스(파일 정보)
		File file = new File(filename);
		
		try {
		Scanner scanner = new Scanner(file);
		// 데이터 저장 변수 선언
		String name;
		float height;
		float weight;
		
		while(scanner.hasNextLine()) { // 더 읽을 라인이 있는지 확인
			name = scanner.next(); // 문자열 토큰 읽기
			height = scanner.nextFloat(); //  실수 토큰 읽기
			weight = scanner.nextFloat(); // 실수 토큰 읽기
			
			System.out.printf("%s, 키: %f, 체중: %f%n", name, height, weight);
			scanner.nextLine();
			
		}
		
		scanner.close();
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		}
		
		
	}

}
