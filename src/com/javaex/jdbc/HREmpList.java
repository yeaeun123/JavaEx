package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HREmpList {
/*
  [실습 1] hr/hr 계정의 사원 이름과 매니저 이름을 함께 출력해 봅시다
 사원 이름은 이름 성 순으로 표기합니다
 정렬은 사원 이름 내림차순입니다
 HREmpList 프로젝트를 만들고 HREmpList 클래스에서 실행되어야 합니다
 */
	public static void main(String[] args) {
	
		String dburl = "jdbc:oracle:thin:@localhost:1522:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			stmt = conn.createStatement();
			
			String sql = "SELECT e.first_name||' '||e.last_name eName, m.first_name||' '||m.last_name mName "
					+ "FROM employees e JOIN employees m ON e.manager_id = m.employee_id "
					+ "ORDER BY ename DESC";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String eName = rs.getString(1);
				String mName = rs.getString(2);
				
				System.out.printf("name: %s, manager: %s %n",eName, mName);
						
			}
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버를 로드하지 못했습니다.");
			e.printStackTrace();
		} catch (SQLException e){
			System.err.println("SQL Error! ");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (Exception e) {
				
			}
			try {
				stmt.close();
			} catch(Exception e) {
				
			}
		 try {
			conn.close();
		} catch (Exception e) {
			
		}
		}
	}

}
