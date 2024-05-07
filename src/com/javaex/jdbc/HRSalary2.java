package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class HRSalary2 {
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

		// Connection, Statement, ResultSet

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		Scanner scanner = new Scanner(System.in);

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);

			System.out.print("최소급여 최대급여:");
			String keyword = scanner.nextLine();

			String[] input = keyword.trim().split(" ");

			stmt = conn.createStatement();

			String sql = "SELECT first_name || ' ' || last_name, salary FROM employees " 
					+ "WHERE salary BETWEEN "
					+ input[0] + " AND " + input[1] + " ORDER BY salary ASC";
			System.out.println("Query:" + sql);

			rs = stmt.executeQuery(sql); // DB Cursor 반환

			// ResultSet 순회
			while (rs.next()) {
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
				rs.close();
			} catch (Exception e) {

			}
			try {
				stmt.close();
			} catch (Exception e) {

			}
			try {
				conn.close();
			} catch (Exception e) {

			}
		}
		
		scanner.close();
	}

}