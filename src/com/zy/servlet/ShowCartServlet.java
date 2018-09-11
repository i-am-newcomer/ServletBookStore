package com.zy.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zy.entity.Book;
import com.zy.entity.OrderItem;
import com.zy.entity.User;
import com.zy.services.ShoppingCartServices;

public class ShowCartServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		String cust_id = String.valueOf(user.getId());
		System.out.println("cust_id: "+cust_id);
		RequestDispatcher view;
		if(cust_id == null) {
			view = request.getRequestDispatcher("notlogin.jsp");
		}
		else {
			Map<OrderItem, Book> orderMap = new ShoppingCartServices().getOrderMap(cust_id);
			session.setAttribute("orderMap", orderMap);    
			view = request.getRequestDispatcher("shoppingcart.jsp");  //显示购物车里面的详细内容
		}
		view.forward(request, response);
	}
	
	

}
