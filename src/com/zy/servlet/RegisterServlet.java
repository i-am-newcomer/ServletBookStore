package com.zy.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zy.entity.User;
import com.zy.services.UserServices;

public class RegisterServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//从请求参数中获取相关值
		String name = request.getParameter("register_username");
		String pwd = request.getParameter("register_pwd");
		String confpwd = request.getParameter("register_confpwd");
		String email = request.getParameter("register_email");
		String phone = request.getParameter("register_phone");
		String reg_checkcode = request.getParameter("register_checkcode");
		//System.out.println("register_checkcode: "+reg_checkcode);
		
		//从会话属性中获取验证码值
		HttpSession session = request.getSession();
		String checkcode = (String)session.getAttribute("checkcode");
		//System.out.println("checkcode: "+checkcode);
		
		//进行注册验证
		String result = new UserServices().register(new User(name, pwd, confpwd, email, phone),  checkcode, reg_checkcode);
		RequestDispatcher view ;
		if(result.equals("true")) {
			view = request.getRequestDispatcher("register_success.jsp"); //注册成功
		}
		else {
			request.setAttribute("register_result", result);  //失败原因保存在会话属性中
			view = request.getRequestDispatcher("register.jsp"); //注册失败
		}
		
		view.forward(request, response);
				
	}
	
	

}
