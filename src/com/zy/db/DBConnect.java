package com.zy.db;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect {
	private Connection conn;
	private ResultSet rs;
	private PreparedStatement prst;
	
	public Connection getConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  //加载JDBC驱动
		} 
		catch (ClassNotFoundException e) {
			System.out.println("加载JDBC驱动失败");
			e.printStackTrace();
		}

		try {
			String url = "jdbc:mysql://localhost:3306/bookstore?serverTimezone=UTC";
			String user = "root";
			String password = "940721";
			conn = DriverManager.getConnection(url, user, password);  //连接MYSQL数据库
		}
		catch(SQLException e) {
			System.out.println("连接数据库失败");
			e.printStackTrace();
		}
		return conn;
	}
	
	//进行数据库的查询操作；
	public ResultSet executeQuery(String sql, Object...objects) {
		conn = this.getConnect();
		try {
			prst = conn.prepareStatement(sql);
			if(objects!=null) {
				for(int i=0; i<objects.length; i++) {
					prst.setString(i+1, (String)objects[i]);
				}
			}
			rs = prst.executeQuery();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;	
	}
	
	//进行数据库的更新操作（包括增加）
	public int executeUpdate(String sql, Object...objects) {
		conn = this.getConnect();
		int result = -1;
		try {
			prst = conn.prepareStatement(sql);
			for(int i=0; i<objects.length; i++) {
				prst.setString(i+1, (String)objects[i]);
			}
			result = prst.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	
		
	}
	
	//释放内存
	public void close() throws SQLException {
		if(prst!=null) {
			prst.close();
		}
		if(rs!=null) {
			rs.close();
		}
		if(conn!=null) {
			conn.close();
		}
	}

}
