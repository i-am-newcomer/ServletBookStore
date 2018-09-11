package com.zy.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zy.entity.User;
import com.zy.services.ShoppingCartServices;

public class AddShoppingCartServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String book_id = request.getParameter("book_id");
		String book_quantity = request.getParameter("book_quantity");
		//System.out.println("book_id: "+book_id);
		//System.out.println("book_quantity: "+book_quantity);
		
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		String cust_id = String.valueOf(user.getId());
		//System.out.println("cust_id:"+cust_id);
	
		//如果用户未登录，则提醒用户登录；若已经登录，则将选择的书本添加到相应用户的orderitems中
		RequestDispatcher view;
		if(cust_id == null) {  
			view = request.getRequestDispatcher("notlogin.jsp");  //用户未登录
		}
		else {
			ShoppingCartServices cartservices = new ShoppingCartServices();
			int result = cartservices.add(book_id, book_quantity, cust_id);
			
			if(result == -1) {
				view = request.getRequestDispatcher("addfail.jsp");
			}
			else{
				view = request.getRequestDispatcher("addsuccess.jsp");
			}
		}
		view.forward(request, response);
		
	
		
	}

}
