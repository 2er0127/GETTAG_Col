package com.gettag.vo; 

public class MemberVO {
	//VO 클래스는 캡슐화 하고자 하는 DB 테이블의 컬럼명과 동일하게 멤버 변수를 갖는다!
	private String userId;
	private String name;
	private String email;
	private String imgUrl; //사용자 google 이미지
	private String type; //사용자 등급(관리자S, 일반U)
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
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
	
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}