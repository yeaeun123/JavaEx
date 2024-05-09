package com.javaex.jdbc.hrsalary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class SalaryDAOImplOracle implements SalaryDAO {

	
	private Connection getConnection() throws SQLException{
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1522:xe";
			
			conn = DriverManager.getConnection(dburl,
									DatabaseConfig.DB_USER,
									DatabaseConfig.DB_PASS);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
			e.printStackTrace();
		}
		return conn;
	}
	@Override
	public List<SalaryVO> getList(){
		List<SalaryVO> list = new ArrayList<>();
		
		try {
			Connection conn = getConnection();
			Statement stmt = conn.createStatement();
			
			String sql = "SELECT first_name, last_name, salary FROM employees "
					+ "WHERE salary BETWEEN ? AND ? "
					+ "ORDER BY salary ASC";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				list.add(new SalaryVO( rs.getString(1), rs.getString(2), rs.getLong(3)));
			}
			rs.close();
			stmt.close();
			conn.close();
		
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public SalaryVO get(int minSalary, int maxSalary) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet  rs = null;
		SalaryVO vo = null;
		
		try {
			conn = getConnection();
			
			String sql =   "SELECT first_name, last_name, salary FROM employees "
					+ "WHERE salary BETWEEN ? AND ? "
					+ "ORDER BY salary ASC";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, minSalary);
			pstmt.setInt(2, maxSalary);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				String firstName = rs.getString(1);
				String lastName = rs.getString(2);
				Long salary = rs.getLong(3);
				vo = new SalaryVO(firstName, lastName, salary);
			}
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			if (rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch (Exception e) {
			
		}
	}
		return vo;
	}

	@Override
	public SalaryVO get(String str) {
		// TODO Auto-generated method stub
		return null;
	}
}
