package com.zy.services;

import java.util.Map;

import com.zy.dao.UserDao;

public class UserServices {
	private UserDao userdao = new UserDao();
	
	public String register(String name, String pwd, String email, String phone, String confpwd, String checkcode, String reg_checkcode) {
		return userdao.register(name, pwd, email, phone, confpwd, checkcode, reg_checkcode);
	}
	
	public Map<String, String> login(String name, String pwd, String login_checkcode, String checkcode) {
		return userdao.login(name, pwd, login_checkcode, checkcode);
	}

}
