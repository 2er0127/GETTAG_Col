package com.gettag.vo;

public class MemberVO {
	//VO 클래스는 캡슐화 하고자 하는 DB 테이블의 컬럼명과 동일하게 멤버 변수를 갖는다!
	private String name;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}


