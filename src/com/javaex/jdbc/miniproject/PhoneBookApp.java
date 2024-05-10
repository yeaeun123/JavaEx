package com.javaex.jdbc.miniproject;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class PhoneBookApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n**********************************************");
		System.out.println("*            전화번호 관리 프로그램             *");
	    System.out.println("************************************************");
		System.out.println("1. 리스트  2. 등록  3. 삭제  4. 검색  5. 종료");
		
		
		boolean running = true;
		
		while(running == true) {
			
			System.out.print("메뉴 번호: ");
			
			String menu = scanner.nextLine();
			
			switch (menu) {
			case "1":
				listPhone(scanner); // 전화번호 목록 표시
				break;
			case "2":
				insertBook(scanner); // 새 전화번호 등록
				break;
			case "3" : 
				deleteBook(scanner);// 전화번호 삭제
				break;
			case "4":
				getBook(scanner); // 전화번호 검색
				break;
			case "5":
				// 종료 메세지 출력
				System.out.println("\n***************************************");
				System.out.println("*           감사합니다.                 *");
				System.out.println("*****************************************");
				running = false; //반복 종료
				break;
			default:
				
			}
		}
			
		System.out.println();	
		
		scanner.close();

	}
	private static void deleteBook(Scanner scanner) {
		
		System.out.print("삭제할 리스트 번호:");
		int listInfo = scanner.nextInt();
		scanner.nextLine();
		PhoneBookDAO dao = new PhoneBookDAOImplOracle();
		boolean success = ((PhoneBookDAO) dao).deleteBook(listInfo);
		
		System.out.println("PhoneBook DELETE "+ (success ? "성공":"실패"));
		

		
	}

	private static void getBook(Scanner scanner) {

		System.out.print("리스트 번호: ");
		int listInfo = scanner.nextInt();
		scanner.nextLine();
		PhoneBookDAO dao = new PhoneBookDAOImplOracle();
		PhoneBookVO vo = dao.get(listInfo);
		
		if (vo != null) {
			System.out.printf("%d\t%s\t%s\t%s%n", vo.getList(), vo.getInsertName(), vo.getInsertPhone(), vo.getInsertHomeNumber());
		
		} else  {
			System.out.println("레코드를 찾지 못했습니다.");
		}
		

	}
	private static void insertBook(Scanner scanner) {
	
			
		System.out.print("이름 : ");	
		String insertName = scanner.nextLine();
		
		System.out.print("핸드폰 : ");
		String insertPhone = scanner.nextLine();
		
		System.out.print("전화번호 : ");
		String insertHomeNumber = scanner.nextLine();
		
		int listInfo = 0;
		PhoneBookVO vo = new PhoneBookVO(listInfo, insertName, insertPhone, insertHomeNumber);
		
		PhoneBookDAO dao = new PhoneBookDAOImplOracle();
		boolean success = dao.addBook(vo);
		
		System.out.println("PhoneBook INSERT "+ (success ? "성공":"실패"));
		
		
	}
	

	private static void listPhone(Scanner scanner) {
		PhoneBookDAO dao = new PhoneBookDAOImplOracle();

		List<PhoneBookVO> list = dao.getList();
		
		if (list.size() > 0) {
			// Iterator 순회
			Iterator<PhoneBookVO> it = list.iterator();
			
			while(it.hasNext()) {
				PhoneBookVO vo = it.next();
				System.out.printf("%d\t%s\t%s\t%s%n", vo.getList(),vo.getInsertName(), vo.getInsertPhone(), vo.getInsertHomeNumber());
				
			}
			
		} else {
			System.out.println("데이터가 없습니다.");
		} 
	}

	
}
