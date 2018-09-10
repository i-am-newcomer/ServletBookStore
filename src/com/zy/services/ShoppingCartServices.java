package com.zy.services;

import java.util.List;
import java.util.Map;

import com.zy.dao.ShoppingCartDao;
import com.zy.entity.Book;
import com.zy.entity.OrderItem;

public class ShoppingCartServices {
	
	private ShoppingCartDao cartdao = new ShoppingCartDao();
	
	public int add(String book_id, String book_quantity, String cust_id) {
		return cartdao.add(book_id, book_quantity, cust_id);
	}
	
	public List<OrderItem> getOrderList(){
		return cartdao.getOrderList();
	}
	
	public Map<OrderItem, Book> getOrderMap(String cust_id){
		return cartdao.getOrderMap(cust_id);
	}

}
