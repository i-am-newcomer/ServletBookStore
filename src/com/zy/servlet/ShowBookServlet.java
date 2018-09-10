package com.zy.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zy.entity.Book;
import com.zy.services.BookServices;

public class ShowBookServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idstr = request.getParameter("book_id");
		
		Book book = new BookServices().getByID(idstr);
		RequestDispatcher view;
		if(book == null) {
			view = request.getRequestDispatcher("showerror.jsp");  //如果BOOK不存在， 跳转到错误页面去
		}
		else {
			request.setAttribute("book", book);
			view = request.getRequestDispatcher("book.jsp");  //如果Book对象存在，将返回的book对象保存在相应的请求属性中
		}
		view.forward(request, response);
	}
	
	

}
