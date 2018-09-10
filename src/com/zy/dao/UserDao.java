package com.zy.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.zy.db.DBConnect;

public class UserDao extends DBConnect {
	
	private ResultSet rs;
	
	//注册验证
	public String register(String name, String pwd, String email, String phone, String confpwd, String checkcode, String reg_checkcode) {
		String sql1 = "SELECT * FROM customers WHERE cust_email=? OR cust_phone=? OR cust_name=?";
		String result = null;
		rs = this.executeQuery(sql1, email, phone, name);
		try {
			if(rs.next()) {
				if(rs.getString(4).equals(email)) {
					result = "该邮箱已被注册";
				}
				else if(rs.getString(5).equals(phone)) {
					result = "该手机号已被注册";
				}
				else {
					result = "该用户名已被注册";
				}
			}
			else if(!email.matches(".+@.+\\.com$")) {
				result = "邮箱格式不正确";
			}
			else if(!phone.matches("^1[0-9]{10}$")) {
				result = "手机号格式不正确";
			}
			else if(name.length()<4) {
				result = "用户名长度不得少于四位";
			}
			else if(pwd.length()<6) {
				result = "密码长度不得少于6位";
			}
			else if(!pwd.equals(confpwd)) {
				result = "密码和确认密码必须一致";
			}
			else if(!checkcode.equals(reg_checkcode)) {
				result = "验证码输入错误";
			}
			else {
				result = "true";
				String sql2 = "INSERT INTO customers(cust_name, cust_password, cust_email, cust_phone) VALUES(?,?,?,?)";
				this.executeUpdate(sql2, name, pwd, email, phone);
			}
			this.close();
		}
		catch (SQLException e) {
			result = "服务器异常";
			e.printStackTrace();
		}
		return result;
	}
	
	//登录验证
	public Map<String, String> login(String name, String pwd, String login_checkcode, String checkcode) {
		String sql = "SELECT * FROM customers WHERE cust_name=? OR cust_email=? OR cust_phone=?";
		rs = this.executeQuery(sql, name, name, name);
		String result = null;
		Map<String, String> resultmap = new HashMap<>();
		try {
			if(rs.next()) {
				if(rs.getString(3).equals(pwd)) {
					if(login_checkcode.equals(checkcode))
					{
						result = String.valueOf(rs.getInt(1));
						resultmap.put("successresult", result);
					}
					else {
						result = "验证码输入错误";
						resultmap.put("failresult", result);
					}
					
				}
				else {
					result = "密码错误";
					resultmap.put("failresult", result);
				}
			}
			else {
				result = "用户名不存在";
				resultmap.put("failresult", result);
			}
			this.close();
		} 
		catch (SQLException e) {
			result = "服务器异常";
			resultmap.put("failresult", result);
			e.printStackTrace();
		}
		return resultmap;
				
	}


}
