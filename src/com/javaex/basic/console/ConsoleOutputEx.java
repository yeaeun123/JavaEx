package com.javaex.basic.console;

public class ConsoleOutputEx {

	public static void main(String[] args) {
		// System.out.println : 출력 후 개행
		// System.out.print : 출력 후 개행 안함
		// System.out.prinf : 형식 지정 문자열 출력
		
		System.out.print("Hello ");
		System.out.println("Java");
		
		String str1 = "Hello";
		String str2 = "Java";
		
		System.out.println(str1+" " + str2);
		
		// 이스케이프 문자
		// \n (개행), \t (탭), \" (인용부호), \\(\) (역슬래시)
		System.out.println("Hello\nJava");
		System.out.println("Hell\tJava");
		System.out.println("Hello, \"Java\"");
		
		String path = "C:\\Users\\Hong\\memo.txt";
		System.out.println(path);
		

	}

}
