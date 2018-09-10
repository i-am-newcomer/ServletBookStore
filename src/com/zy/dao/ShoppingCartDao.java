package com.zy.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zy.db.DBConnect;
import com.zy.entity.Book;
import com.zy.entity.OrderItem;

public class ShoppingCartDao extends DBConnect{
	
	private ResultSet rs;
	private ResultSet rs2;
	
	//添加进购物车的操作
	public int add(String book_id, String book_quantity, String cust_id) {
		String sql1 = "SELECT * FROM orderitems WHERE cust_id=?";
		String sql2 = "INSERT INTO orderitems(order_num, order_book, book_quantity, book_id, cust_id) VALUES(?,?,?,?,?)";
		String sql3 = "UPDATE orderitems SET book_quantity=? WHERE book_id=?";
		int order_num = 0;
		int order_book = 0;
		rs = this.executeQuery(sql1, cust_id);
		try {
			if(!rs.next()) {
				//该用户购物车中无东西，直接对orderitems表进行插入操作，order_num执行自加
				this.close();
				return this.executeUpdate(sql2, null, "1", book_quantity, book_id, cust_id);
			}
			else {
				//该用户购物车已添加过物品，对已添加过的book_id执行更新操作，未添加过的执行插入操作
				rs.beforeFirst(); //将游标移至第一个数据前
				while(rs.next()) {
					//
					if(Integer.parseInt(book_id) == rs.getInt(4)) {
						book_quantity = String.valueOf(rs.getInt(3)+1);
						//System.out.println(book_quantity);
						this.close();
						return this.executeUpdate(sql3, book_quantity, book_id);
					}
				}
				rs.last(); //将游标移至最后
				order_num = rs.getInt(1); //order_num不变
				order_book = rs.getInt(2) + 1;  //order_book在最大的数字加一
				this.close();
				return this.executeUpdate(sql2, String.valueOf(order_num), String.valueOf(order_book), book_quantity, book_id, cust_id);
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return -1;
		
	}
	
	public List<OrderItem> getOrderList(){
		ArrayList<OrderItem> orderList = new ArrayList<>();
		String sql = "SELECT * FROM orderitems";
		rs = this.executeQuery(sql);
		try {
			while(rs.next()) {
				orderList.add(new OrderItem(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5)));
			}
			this.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return orderList.size()>0?orderList:null;
	
	}
	
	//得到当前用户的订单项和相应Book对象的Map
	public Map<OrderItem, Book> getOrderMap(String cust_id){
		Map<OrderItem, Book> orderMap = new HashMap<OrderItem, Book>();
		String sql1 = "SELECT * FROM orderitems WHERE cust_id=?";
		String sql2 = "SELECT * FROM book WHERE book_id=?";
		rs = this.executeQuery(sql1, cust_id);
		
		try {
			while(rs.next()) {
				int book_id = rs.getInt(4);
				rs2 = this.executeQuery(sql2, String.valueOf(book_id));
				if(rs2.next()) {
					OrderItem orderitem = new OrderItem(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
					Book book = new Book(rs2.getInt(1), rs2.getString(2), rs2.getDouble(3), rs2.getInt(4), rs2.getString(5), rs2.getString(6), rs2.getString(7), rs2.getString(8), rs2.getString(9));
					orderMap.put(orderitem, book);	
				}		
			}
			this.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return orderMap.size()>0?orderMap:null;
	
	}
}
