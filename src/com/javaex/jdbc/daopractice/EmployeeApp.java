package com.javaex.jdbc.daopractice;

import java.util.List;
import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		getEmployee();

	}

	private static void getEmployee() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 검색:");
		String keyword = scanner.nextLine();
		
		
		EmployeeDAO dao = new EmployeeDAOImplOracle();
		List<EmployeeVO> vo = dao.get(keyword);
		
		if (vo != null) {
			System.out.printf("%s\t%s\t%s\t%s\t%s\t %d%n", vo.getFirst(),
					vo.getLast(), ((EmployeeVO) vo).getEmail(), ((EmployeeVO) vo).getPhoneNumber(),
					((EmployeeVO) vo).getHireDate(), ((EmployeeVO) vo).getSalary());
		} else {
			System.out.println("레코드를 찾지 못했습니다.");
		}
		scanner.close();
	}
}
