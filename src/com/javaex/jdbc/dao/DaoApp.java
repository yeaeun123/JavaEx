package com.javaex.jdbc.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DaoApp {

	public static void main(String[] args) {
		listAuthors();
		System.out.println();
		
		insertAuthor();
		System.out.println();
		
		listAuthors();
		
	}
	private static void insertAuthor() {
		// 키보드로부터 이름과 정보 입력받아서 전송
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 : ");	
		String name = scanner.nextLine();
		
		System.out.print("정보 : ");
		String desc = scanner.nextLine();
		
		AuthorVO vo = new AuthorVO(name, desc);
		
		AuthorDAO dao = new AuthorDAOImplOracle();
		boolean success = dao.insert(vo);
		
		System.out.println("Author INSERT "+ (success ? "성공":"실패"));
		
		scanner.close();
	}

	private static void listAuthors() {
		AuthorDAO dao = new AuthorDAOImplOracle();
		System.out.println("============Authors=============");
		
		List<AuthorVO> list = dao.getList();
		if (list.size() > 0) {
			// Iterator 순회
			Iterator<AuthorVO> it = list.iterator();
			
			while(it.hasNext()) {
				AuthorVO vo = it.next();
				System.out.printf("%d\t%s\t%s%n", vo.getAuthorId(),
								vo.getAuthorName(), vo.getAuthorDesc());
			}
		} else {
			System.out.println("데이터가 없습니다.");
		}
	}
	
}
