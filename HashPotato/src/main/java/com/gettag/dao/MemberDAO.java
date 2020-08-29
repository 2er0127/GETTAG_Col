package com.gettag.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.gettag.util.ConnectionPool;
import com.gettag.vo.AuthInfo;

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

public class MemberDAO {
		Connection conn = null;
	
	private AuthInfo member = new AuthInfo();
	
	public void insert(AuthInfo member) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append(" INSERT INTO member (userId, name, email, imgUrl, type ) ");
			sql.append(" VALUES (?, ?, ?, ?, ?) ");
			
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setString(index++, member.getUserId());
			pstmt.setString(index++, member.getName());
			pstmt.setString(index++, member.getEmail());
			pstmt.setString(index++, member.getImgUrl());
			pstmt.setString(index++, member.getType());
			
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
 