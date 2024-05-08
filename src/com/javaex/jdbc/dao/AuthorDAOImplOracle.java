package com.javaex.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAOImplOracle implements AuthorDAO {
									// throws를 통해 외부로 예외 던지기
	private Connection getConnection() throws SQLException {
		
		Connection conn = null;
		
		try {
		//드라이버 로드
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
	public List<AuthorVO> getList() {
		List<AuthorVO> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
		// 1. Connection 
			conn = getConnection();
		// 2. Statement
			stmt = conn.createStatement();
		// 3. SQL 쿼리 전송 -> ResultSet
			String sql = "SELECT author_id, author_name, author_desc FROM author";
			rs = stmt.executeQuery(sql);
			
		// 4. ResultSet 순회 -> 레코드를 AuthorVO로 변경
		// 						List에 추가
			while(rs.next()) {
				Long authorId = rs.getLong(1); // = rs.getLong("author_id")
				String authorName = rs.getString(2);
				String authorDesc = rs.getString(3);
				
				AuthorVO vo = new AuthorVO(authorId, authorName, authorDesc);
				list.add(vo);
			}
		// 5. List를 반환
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				
			}
		}
		return list;
	}

	@Override
	public AuthorVO get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(AuthorVO authorVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0; // INSERT 결과 영향받은 레코드 수 
		
		try {
			// 커넥션 생성
			conn = getConnection();
			// 실행계획 준비
			String sql = "INSERT INTO author (author_id, author_name, author_desc) " // 컬럼목록
							+ "VALUES (seq_author_id.NEXTVAL, ?, ?)"; // 값목록(author_id, author_name, author_desc)
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, authorVo.getAuthorName());
			pstmt.setString(2,  authorVo.getAuthorDesc());
			
			// 생성된 쿼리 수행
			insertedCount = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
				
			} catch (Exception e) {
				
			}
		}
		return insertedCount == 1;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(AuthorVO authorVo) {
		// TODO Auto-generated method stub
		return false;
	}

}
