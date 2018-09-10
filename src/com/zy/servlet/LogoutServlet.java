package com.zy.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//将会话属性中的user_id值置null,退出当前用户登录；
		HttpSession session = request.getSession();
		session.setAttribute("cust_id", null);;
		RequestDispatcher view =  request.getRequestDispatcher("login.jsp");
		view.forward(request, response);
	}
	
	

}
