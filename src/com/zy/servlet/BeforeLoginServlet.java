package com.zy.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BeforeLoginServlet extends HttpServlet {

	public  void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher view;
		//判断是否已经登录，若已经登录，则转到login_sucess页面，否则跳到登录页面
		if(session.getAttribute("cust_id")!=null) {
			view = request.getRequestDispatcher("login_success.jsp");
		}
		else {
			view = request.getRequestDispatcher("login.jsp");
		}
		view.forward(request, response);
	}
	
	

}
