package com.zy.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.zy.db.DBConnect;
import com.zy.entity.Book;

public class BookDao extends DBConnect{
	private ResultSet rs;
	
	//根据book_id查询得到相应的Book对象
	public Book getByID(String idstr) {
		String sql = "SELECT * FROM book WHERE book_id=?";
		rs = this.executeQuery(sql, idstr);
		try {
			if(rs.next()) {
				return new Book(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getString(5)
						,rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
			}
			this.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	
	}
}
