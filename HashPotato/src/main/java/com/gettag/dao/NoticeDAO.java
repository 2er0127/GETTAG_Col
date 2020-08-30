package com.gettag.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.gettag.util.ConnectionPool;
import com.gettag.vo.NoticeVO;




/*
   CREATE TABLE notice (
		no 			INT 			AUTO_INCREMENT,
		title		VARCHAR(200)
		writer 		VARCHAR(40);
		content 	VARCHAR(4000);
		reg_date 	TIMESTAMP,
		PRIMARY KEY (no)
	);	
*/

public class NoticeDAO {
	
	private NoticeDAO notice = new NoticeDAO();
	
	public void insert(NoticeVO notice) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append(" INSERT INTO board (no, title, writer, content, reg_date ) " );
			sql.append(" VALUES (?, ?, ?, ?, ?) ");
			
			pstmt = con.prepareStatement(sql.toString());
			int index =1;
			pstmt.setInt(index++, notice.getNo());
			pstmt.setString(index++, notice.getTitle());
			pstmt.setString(index++, notice.getWriter());
			pstmt.setString(index++, notice.getContent());
			pstmt.setString(index++, notice.getReg_date());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try{ if(pstmt != null) pstmt.close();}
			catch(Exception e) { e.printStackTrace();}
			ConnectionPool.close(con);
			}
		
	}
	
	public List<NoticeVO> selectAllBoard() throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		List<NoticeVO> list = new ArrayList<>();
		
		try {
			con = ConnectionPool.getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append(" SELECT no, title, writer, reg_date ");
			sql.append(" 	FROM member ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				NoticeVO board = new NoticeVO();
				
				// 1. 데이터베이스에서 조회 결과 가져오기
				int no = rs.getInt("no");
				String title = rs.getNString("title");
				String writer = rs.getString("writer");
				String reg_date = rs.getString("reg_date");
				
				// 2. 리스트에 담아 전달하기 위한 NoticeVO 저장
				board.setNo(no);
				board.setTitle(title);
				board.setWriter(writer);
				board.setReg_date(reg_date);
				
				// 3. 리스트 저장
				list.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null)
				pstmt.close();
			ConnectionPool.close(con);
		}
		return list;
	}
	public int selectNo() {
		Connection con = null;
		PreparedStatement pstmt = null;
		int no = 0;
		
		try {
			con = ConnectionPool.getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append(" SELECT max(no) + 1 ");
			sql.append("   FROM board ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			ResultSet rs = pstmt.executeQuery();
			
			rs.next();
			no = rs.getInt(1);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if(pstmt != null) pstmt.close(); }
			catch(Exception e) { e.printStackTrace(); }
			ConnectionPool.close(con);
		}
		return no;
	}
	
	
	public void updateViewCnt(int no) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionPool.getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append(" UPDATE board ");
			sql.append("    SET view_cnt = view_cnt + 1 ");
			sql.append("  WHERE no = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if(pstmt != null) pstmt.close(); }
			catch(Exception e) { e.printStackTrace(); }
			ConnectionPool.close(con);
		}
	}

}
