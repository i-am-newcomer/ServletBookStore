package com.zy.services;

import java.util.Map;

import com.zy.dao.UserDao;
import com.zy.entity.User;

public class UserServices {
	private UserDao userdao = new UserDao();
	
	public String register(User user, String checkcode, String reg_checkcode) {
		return userdao.register(user, checkcode, reg_checkcode);
	}
	
	public Map<String, String> login(String name, String pwd, String login_checkcode, String checkcode) {
		return userdao.login(name, pwd, login_checkcode, checkcode);
	}

}
