package com.zy.entity;

public class OrderItem {
	private int ordernum;
	private int booknum;
	private int bookquantity;
	private int bookid;
	private int custid;
	
	public OrderItem() {
		super();
	}
	
	public OrderItem(int booknum, int bookquantity, int bookid, int custid) {
		super();
		this.booknum = booknum;
		this.bookquantity = bookquantity;
		this.bookid = bookid;
		this.custid = custid;
	}

	public OrderItem(int ordernum, int booknum, int bookquantity, int bookid, int custid) {
		super();
		this.ordernum = ordernum;
		this.booknum = booknum;
		this.bookquantity = bookquantity;
		this.bookid = bookid;
		this.custid = custid;
	}

	public int getOrdernum() {
		return ordernum;
	}
	public void setOrdernum(int ordernum) {
		this.ordernum = ordernum;
	}
	public int getBooknum() {
		return booknum;
	}
	public void setBooknum(int booknum) {
		this.booknum = booknum;
	}
	public int getBookquantity() {
		return bookquantity;
	}
	public void setBookquantity(int bookquantity) {
		this.bookquantity = bookquantity;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	
	

}
