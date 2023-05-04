package com.example.frogbanchan.controller;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MemberForm implements Serializable {
	private String username;
	private String password;
	private String confirmPassword;
	private String name;
	private String ninkname;
	private String phone;
	private String email;
	
	public MemberForm(String username, String password, String confirmPassword,
			String name, String ninkname, String phone, String email) {
		super();
		this.username = username;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.name = name;
		this.ninkname = ninkname;
		this.phone = phone;
		this.email = email;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNinkname() {
		return ninkname;
	}
	public void setNinkname(String ninkname) {
		this.ninkname = ninkname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
