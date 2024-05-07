package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class HRSearchEmployee {
/*
  [실습 2] 사원 검색 프로그램
: 클래스 Scanner를 사용하여 사원 이름을 입력 받아 사원 정보를 검색하는 프로그램
을 작성해 봅시다
 부분 이름 검색이 가능해야 합니다
 성, 이름 컬럼에 대해 OR 검색이 되어야 합니다
 출력 사원 정보는 이름 성, Email, 전화번호, 입사일입니다
 HRSearchEmployees 프로젝트를 만들고 HRSearchEmployee 클래스에서 실행되어야 합니다
 */
	public static void main(String[] args) {

		    String dburl = "jdbc:oracle:thin:@localhost:1522:xe";
	        String dbuser = "hr";
	        String dbpass = "hr";

	        Connection conn = null;
	        PreparedStatement stmt = null;
	        ResultSet rs = null;

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("이름 검색: ");
	        String keyword = scanner.next();

	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            conn = DriverManager.getConnection(dburl, dbuser, dbpass);

	            String sql = "SELECT first_name, last_name, email, phone_number, hire_date "
	                    + "FROM employees "
	                    + "WHERE LOWER(first_name) LIKE LOWER (?)"
	                    + "OR LOWER(last_name) LIKE LOWER(?)";

	            stmt = conn.prepareStatement(sql);
	            stmt.setString(1, "%" + keyword + "%");
	            stmt.setString(2, "%" + keyword + "%");

	            rs = stmt.executeQuery();

	            while (rs.next()) {
	                String firstName = rs.getString("first_name");
	                String lastName = rs.getString("last_name");
	                String email = rs.getString("email");
	                String phoneNumber = rs.getString("phone_number");
	                Date hireDate = rs.getDate("hire_date");
	                	//java util date로 받음
	                
	                System.out.printf("%s %s, %s, %s, %s%n", firstName, lastName, email, phoneNumber, hireDate);
	            }
	        } catch (ClassNotFoundException e) {
	            System.err.println("JDBC 드라이버를 로드하지 못했습니다.");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            System.err.println("SQL 오류!");
	            e.printStackTrace();
	        } finally {
	            // 리소스 해제
	            try {
	                if (rs != null) rs.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	            try {
	                if (stmt != null) stmt.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	            try {
	                if (conn != null) conn.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	            // Scanner 객체 닫기
	            scanner.close();
	        }
	    }
	}