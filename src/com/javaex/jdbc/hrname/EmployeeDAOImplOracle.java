package com.javaex.jdbc.hrname;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.javaex.jdbc.dao.DatabaseConfig;

public class EmployeeDAOImplOracle implements EmployeeDAO {
	 private Connection getConnection() throws SQLException {
	        Connection conn = null;
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            String dburl = "jdbc:oracle:thin:@localhost:1522:xe";
	            conn = DriverManager.getConnection(dburl, DatabaseConfig.DB_USER, DatabaseConfig.DB_PASS);
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
	            String sql = "SELECT first_name, last_name, email, phone_number, hire_date, salary FROM employees";
	            rs = stmt.executeQuery(sql);

	            while (rs.next()) {
	                String firstName = rs.getString("first_name");
	                String lastName = rs.getString("last_name");
	                String email = rs.getString("email");
	                String phoneNumber = rs.getString("phone_number");
	                String hireDate = rs.getString("hire_date");
	                Long salary = rs.getLong("salary");

	                EmployeeVO vo = new EmployeeVO(firstName, lastName, email, phoneNumber, hireDate, salary);
	                list.add(vo);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            // Close resources (conn, stmt, rs) here if needed
	        }
	        return list;
	    }

		@Override
		public EmployeeVO get(String firstName, String lastName) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public EmployeeVO get(String keyword) {
			// TODO Auto-generated method stub
			return null;
		}
	

}
