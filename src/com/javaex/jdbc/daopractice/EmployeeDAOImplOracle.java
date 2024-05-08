package com.javaex.jdbc.daopractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public  class EmployeeDAOImplOracle implements EmployeeDAO {
	
	private Connection getConnection() throws SQLException{
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1522:xe";
			
			conn = DriverManager.getConnection(dburl,
									DatabaseConfig.DB_USER,
									DatabaseConfig.DB_PASS);
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 찾을 수 없습니다.");
			e.printStackTrace();
		}
		return conn;
	}

	@Override
	public List<EmployeeVO> getList() {
		List<EmployeeVO> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			//이름 성, Email, 전화번호, 입사일,salary
			String sql = "SELECT first_name,last_name, email, phone_number, hire_date,"
					+ "salary FROM employees";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String firstName = rs.getString(1);
				String lastName = rs.getString(2);
				String email = rs.getString(3);
				String phoneNumber = rs.getString(4);
				String hireDate = rs.getString(5);
				Long salary = rs.getLong(6);
				
				EmployeeVO vo = new EmployeeVO(firstName,lastName,email,phoneNumber,hireDate,salary);
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch(Exception e) {
				
			}
					
		}
		return list;
	}

	@Override
	public List<EmployeeVO> get(String keyword) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet  rs = null;
		EmployeeVO vo = null;
		List<EmployeeVO> result = new ArrayList<>();
		
		
		try {
			conn = getConnection();
			
			String sql = "SELECT first_name,last_name, email, phone_number, hire_date,"
					+ "salary FROM employees WHERE LOWER(first_name) LIKE LOWER (?)"
					+"OR LOWER(last_name) LIKE LOWER (?) ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + keyword + "%");
			pstmt.setString(2, "%" + keyword + "%");
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				String firstName1 = rs.getString(1);
				String lastName1 = rs.getString(2);
				String email = rs.getString(3);
				String phoneNumber = rs.getString(4);
				String hireDate = rs.getString(5);
				Long salary = rs.getLong(6);
				vo = new EmployeeVO(firstName1, lastName1,email,phoneNumber,hireDate,salary);
				result.add(vo);
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				
			}
		}
		return (List<EmployeeVO>) vo;		
	}
	
	

}
