package com.zy.entity;

public class User {
	private int id;
	private String name;
	private String pwd;
	private String confpwd;
	private String email;
	private String phone;
	
	public User() {
		super();
	}
	
	public User(String name, String pwd, String email, String phone) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.email = email;
		this.phone = phone;
	}

	public User(String name, String pwd, String confpwd, String email, String phone) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.confpwd = confpwd;
		this.email = email;
		this.phone = phone;
	}

	public User(int id, String name, String pwd, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.email = email;
		this.phone = phone;
	}

	public User(int id, String name, String pwd, String confpwd, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.confpwd = confpwd;
		this.email = email;
		this.phone = phone;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getConfpwd() {
		return confpwd;
	}
	public void setConfpwd(String confpwd) {
		this.confpwd = confpwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pwd=" + pwd + ", email=" + email + ", phone=" + phone + "]";
	}
	
	

	
}
