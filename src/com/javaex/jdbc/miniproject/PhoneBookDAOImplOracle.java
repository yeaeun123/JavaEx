package com.javaex.jdbc.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.javaex.jdbc.dao.DatabaseConfig;

public class PhoneBookDAOImplOracle implements PhoneBookDAO {
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
	public List<PhoneBookVO> getList() {
		List<PhoneBookVO> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT list_info, insert_name,insert_phone, insert_homenumber FROM phonebook";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int listInfo = rs.getInt(1);
				String insertName = rs.getString(2);
				String insertPhone = rs.getString(3);
				String insertHomeNumber = rs.getString(4);
				
				PhoneBookVO vo = new PhoneBookVO(listInfo, insertName, insertPhone,insertHomeNumber);
				list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	
	}

	@Override
	public PhoneBookVO get(int listInfo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;		
		PhoneBookVO vo = null;
		
		try {
			conn = getConnection();
			
			String sql = "SELECT list_info, insert_name, insert_phone, insert_homenumber FROM phonebook"
							+" WHERE list_info = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, listInfo);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int listInfo1 = rs.getInt(1);
				String insertName = rs.getString(2);
				String insertPhone = rs.getString(3);
				String insertHomeNumber = rs.getString(4);
				vo = new PhoneBookVO(listInfo1,insertName, insertPhone, insertHomeNumber);
				
			}
		} catch (SQLException e ) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null)pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		return vo;
	}

	@Override
	public boolean addBook(PhoneBookVO phoneBookVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;
		
		try {
			conn = getConnection();
			
			String sql = "INSERT INTO phonebook(list_info, insert_name, insert_phone, insert_homenumber)"
					+" VALUES (seq_list_info.NEXTVAL, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, phoneBookVo.getInsertName());
			pstmt.setString(2, phoneBookVo.getInsertPhone());
			pstmt.setString(3, phoneBookVo.getInsertHomeNumber());
			
			insertedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt !=null) pstmt.close();
				if(conn != null) conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return insertedCount == 1;
	}

	@Override
	public boolean deleteBook(int listInfo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int deletedCount = 0;
		try {
			conn = getConnection();
			
			String sql = "DELETE FROM phonebook WHERE list_info =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, listInfo);
			
			deletedCount = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			}catch (Exception e) {
				
			}
		}
		return deletedCount == 1;
	}

	@Override
	public boolean insert(PhoneBookVO vo) {
		// TODO Auto-generated method stub
		return false;
	}
		
	}


