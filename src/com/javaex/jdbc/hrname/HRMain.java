package com.javaex.jdbc.hrname;

import java.util.List;
import java.util.Scanner;

import com.javaex.jdbc.daopractice.EmployeeDAO;
import com.javaex.jdbc.daopractice.EmployeeDAOImplOracle;
import com.javaex.jdbc.daopractice.EmployeeVO;


/*
 *  [실습] 사원 정보 검색 프로그램 (DAO 버전)
: 클래스 Scanner를 사용하여 사원 이름을 입력 받아 사원 정보를 검색하는 프로
그램을 작성해 봅시다
 부분 이름 검색이 가능해야 합니다
 성, 이름 컬럼에 대해 OR 검색이 되어야 합니다
 출력 사원 정보는 이름 성, Email, 전화번호, 입사일, 월급 입니다
 HRApp 프로젝트에서 HRMain Class에 main 메서드가 있어야 합니다
 */
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


