package com.zy.services;

import com.zy.dao.BookDao;
import com.zy.entity.Book;

public class BookServices {
	
	private BookDao bookdao = new BookDao();

	public Book getByID(String idstr) {
		return bookdao.getByID(idstr);
	}

}
