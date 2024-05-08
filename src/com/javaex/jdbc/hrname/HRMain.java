package com.javaex.jdbc.hrname;

import java.util.List;
import java.util.Scanner;

import com.javaex.jdbc.daopractice.EmployeeDAO;
import com.javaex.jdbc.daopractice.EmployeeDAOImplOracle;
import com.javaex.jdbc.daopractice.EmployeeVO;

public class HRMain {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
	        EmployeeDAO employeeDAO = new EmployeeDAOImplOracle(); // Oracle 데이터베이스에 특화된 DAO 클래스

	        System.out.print("사원 이름을 입력하세요: ");
	        String keyword = scanner.nextLine(); // 사용자로부터 이름 입력 받기

	        List<EmployeeVO> employees = employeeDAO.getList(); // 모든 사원 정보 가져오기

	        // 이름과 성 컬럼에 대해 OR 검색 수행
	        for (EmployeeVO employee : employees) {
	            if (employee.getFirstName().contains(keyword) || employee.getLastName().contains(keyword)) {
	                // 검색된 사원 정보 출력
	                System.out.print("이름: " + employee.getFirstName() + " " + employee.getLastName());
	                System.out.print("Email: " + employee.getEmail());
	                System.out.print("전화번호: " + employee.getPhoneNumber());
	                System.out.print("입사일: " + employee.getHireDate());
	                System.out.print("월급: " + employee.getSalary());
	                System.out.println();
	            }
	        }

	        scanner.close();
	    }
	
	}


