package com.javaex.jdbc.hrsalary;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class HRApp {
	


	public static void main(String[] args) {
		getSalary();
		listSalary();
		
		
	}
	private static void getSalary() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("최소급여 : ");
		scanner.nextInt();
		System.out.print("최대 급여 : ");
		scanner.nextInt();
		
		SalaryDAO dao = new SalaryDAOImplOracle();
		String keyword = null;
		SalaryVO vo = dao.get(keyword);
		
		if(vo != null) {
			System.out.printf("%s %s \t%d%n", vo.getFirstName(), vo.getLastName(), vo.getSalary());
			
		} else {
			System.out.println("레코드를 찾지 못했습니다.");
		}
		scanner.close();
	}
	private static void listSalary() {
		SalaryDAO dao = new SalaryDAOImplOracle();
		System.out.println();
		
		List<SalaryVO> list = dao.getList();
		if(list.size() > 0) {
			Iterator <SalaryVO> it = list.iterator();
			while (it.hasNext()) {
				SalaryVO vo = it.next();
				System.out.printf("%s %s \t%d%n", vo.getFirstName(), vo.getLastName(), vo.getSalary());

			}
			
		}else {
			System.out.println("데이터를 찾지 못했습니다.");
		}
	}

}
