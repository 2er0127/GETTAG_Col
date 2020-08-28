package com.gettag.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class ConnectionPool {
	// 연결할 수 있는 최대 자원을 5개로 한정
	private static final int INIT_COUNT = 5;
	private static final String URL
		= "jdbc:mysql://127.0.0.1:3306/jblog?serverTimezone=UTC";
	
	// 사용 가능한 Connection 객체 정보를 담는 리스트
	private static ArrayList<Connection> freeList = new ArrayList<>();
	// 사용 중인 Connection 객체 정보를 담는 리스트
	private static ArrayList<Connection> usedList = new ArrayList<>();
	
	// Static Block
	static { // 클래스 로딩 시 (스태틱 멤버) 해당 로직을 수행! (***** 초기화 작업 시)
		// 초기화 작업 : 5개의 Connection을 생성하여 사용 가능한 리스트에 담겠다.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			for(int i=0; i<INIT_COUNT; i++)
				freeList.add(DriverManager.getConnection(URL
														, "root"
														, "root"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws Exception {
		// 더 이상 사용 가능한 Connection이 없다면, 예외 발생!
		if(freeList.isEmpty())
			throw new Exception("[Connection Error] : 사용 가능한 Connection이 남아있지 않습니다.");
		
		// remove() : 단순히 삭제가 아니라, 반환까지!
		Connection con = freeList.remove(0); // freeList 삭제 후 반환 받아,
		usedList.add(con); // userList에 추가!
		// -> 삭제된 객체를 다른 리스트에서 사용!
		
		System.out.println("free Connection Count : " + freeList.size());
		System.out.println("used Connection Count : " + usedList.size());
		
		return con;
	}
	
	public static void close(Connection con) {
		usedList.remove(usedList.indexOf(con));
		freeList.add(con);
	}
}