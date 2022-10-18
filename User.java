package com.gl.JavaCaseStudy17102022.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private String UserId;
	private String UserPass;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userId, String userPass) {
		super();
		UserId = userId;
		UserPass = userPass;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUserPass() {
		return UserPass;
	}
	public void setUserPass(String userPass) {
		UserPass = userPass;
	}
	
	
}
