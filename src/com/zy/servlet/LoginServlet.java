package com.zy.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zy.services.UserServices;

public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取请求参数
		String name = request.getParameter("login_name");
		String pwd = request.getParameter("login_pwd");
		String login_checkcode = request.getParameter("login_checkcode");
		
		//获取会话属性中的验证码
		HttpSession session = request.getSession();
		String checkcode = (String) session.getAttribute("checkcode");
		
		//进行登录验证。 若验证通过，返回验证结果和user_id的map， 并将user_id保存在会话属性中；若验证不通过，返回验证结果和错误信息的map;
		Map<String, String> resultmap = new UserServices().login(name, pwd, login_checkcode, checkcode);
		RequestDispatcher view;
		if(resultmap.get("successresult")!=null) {
			session.setAttribute("cust_id", resultmap.get("successresult"));
			session.setAttribute("username", name);
			view = request.getRequestDispatcher("login_success.jsp");
		}
		else {
			request.setAttribute("login_result", resultmap.get("failresult"));
			view = request.getRequestDispatcher("login.jsp");
		}
		view.forward(request, response);
	}
	
	

}
