package com.gl.JavaCaseStudy17102022.bean;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

@Entity
public class MyUsers extends User{
	
	@Id
	private String username;
	private String password;
	
	public MyUsers() {
		super("Rose","Apple",new ArrayList<>());
	}

	
	public String getUserName() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}