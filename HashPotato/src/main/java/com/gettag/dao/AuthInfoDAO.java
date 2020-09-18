package com.gettag.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.gettag.util.ConnectionPool;
import com.gettag.vo.AuthInfoVO;

/*
[Table 생성] - 게시판, 파일
CREATE TABLE member(
 userId		VARCHAR(20)		NOT NULL,		
 name 		VARCHAR(10) 	NOT NULL,
 email		VARCHAR(40) 	NOT NULL,
 imgUrl 	TEXT			NULL,
 type		VARCHAR(1) 		NOT NULL,
 PRIMARY KEY (userId)
);

*/

public class AuthInfoDAO {
		Connection conn = null;
	
	private AuthInfoVO member = new AuthInfoVO();
	
	public void insert(AuthInfoVO member) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append(" INSERT INTO authinfo (clientId, clientSecret, type ) ");
			sql.append(" VALUES (?, ?, 'U') "); // type S:관리자, U:일반유저
			
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setString(index++, member.getClientId());
			pstmt.setString(index++, member.getClientSecret());
		
			
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if(pstmt != null) pstmt.close();}
			catch(Exception e) { e.printStackTrace();}
			ConnectionPool.close(con);
		}
	}  
}
 