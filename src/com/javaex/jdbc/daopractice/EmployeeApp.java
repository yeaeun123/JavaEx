package com.javaex.jdbc.daopractice;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		getEmployee();
		listEmployees();

	}

	private static void getEmployee() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 검색:");
		String keyword = scanner.nextLine();
		keyword = "%" +keyword.toLowerCase() + "%";
		
		EmployeeDAO dao = new EmployeeDAOImplOracle();
		EmployeeVO vo = dao.get(keyword);
		
		if (vo != null) {
			System.out.printf("%s\t%s\t%s\t%s\t%s\t %d%n", vo.getFirstName(),
					vo.getLastName(), ((EmployeeVO) vo).getEmail(), ((EmployeeVO) vo).getPhoneNumber(),
					((EmployeeVO) vo).getHireDate(), ((EmployeeVO) vo).getSalary());
		} else {
			System.out.println("레코드를 찾지 못했습니다.");
		}
		scanner.close();
	}
	private static void listEmployees() {
		EmployeeDAO dao = new EmployeeDAOImplOracle();
		System.out.println();
		
		List<EmployeeVO> list = dao.getList();
		if(list.size() > 0) {
			Iterator <EmployeeVO> it = list.iterator();
			while (it.hasNext()) {
				EmployeeVO vo = it.next();
				System.out.printf("%s\t%s\t%s\t%s\t%s\t %d%n", vo.getFirstName(),
					vo.getLastName(), ((EmployeeVO) vo).getEmail(), ((EmployeeVO) vo).getPhoneNumber(),
					((EmployeeVO) vo).getHireDate(), ((EmployeeVO) vo).getSalary());
			}
		} else {
			System.out.println("데이터를 찾지 못했습니다.");
		}
	}
}
