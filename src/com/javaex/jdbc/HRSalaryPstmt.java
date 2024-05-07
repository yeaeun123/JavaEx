package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HRSalaryPstmt {
	/*
	 * [실습 3] 급여 검색 프로그램 작성
	: 사용자로부터 최소 급여와 최대 급여를 입력 받아 급여가 이 범위 내에 속하는 사원
	의 정보를 출력하는 프로그램을 작성해 봅시다
	 정렬은 salary 오름차순입니다
	 HRSalary 프로젝트의 HRSalary 클래스에서 실행되어야 합니다
	 결과 예시
	2000 10000
	============================================================
	Kevin Freeney 3000
	Donald Oconnell 4000
	Pat Fay 90000
	 */
	public static void main(String[] args) {

		String dburl = "jdbc:oracle:thin:@localhost:1522:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl,dbuser,dbpass);
			
			System.out.print("최소급여 최대급여:");
			String keyword = scanner.nextLine();
			
			String[] input = keyword.trim().split(" ");
			
			// 실행 계획 수립
			String sql = "SELECT first_name || ' ' || last_name, salary FROM employees "+
						"WHERE salary BETWEEN ? AND ? ORDER BY salary ASC";
					
			pstmt = conn.prepareStatement(sql);
			// 동적 파라미터 바인딩
			
			pstmt.setString(1, input[0]);
			pstmt.setString(2, input[1]);
			
			// 쿼리 수행
			rs = pstmt.executeQuery();
			
			// rs 순회 출력
			while(rs.next()) {
				String name = rs.getString(1);
				int salary = rs.getInt(2);
				System.out.printf("%s\t%d%n", name, salary);
			}
			
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 로드하지 못했습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("SQLError!");
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			
			} catch (Exception e) {
				
			}
		}
		scanner.close();
	}

}
