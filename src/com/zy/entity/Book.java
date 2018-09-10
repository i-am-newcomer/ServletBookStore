package com.zy.entity;

public class Book {
	private int id;
	private String name;
	private Double price;
	private int amount;
	private String image;
	private String author;
	private String publisher;
	private String type;
	private String intro;
	
	public Book() {
		super();
	}

	public Book(String name, Double price, int amount, String image) {
		super();
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.image = image;
	}

	public Book(String name, Double price, int amount, String image, String author, String publisher,
			String type, String intro) {
		super();
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.image = image;
		this.author = author;
		this.publisher = publisher;
		this.type = type;
		this.intro = intro;
	}
	
	public Book(int id, String name, Double price, int amount, String image, String author, String publisher,
			String type, String intro) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.image = image;
		this.author = author;
		this.publisher = publisher;
		this.type = type;
		this.intro = intro;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", amount=" + amount + ", image=" + image
				+ ", author=" + author + ", publisher=" + publisher + ", type=" + type + ", intro=" + intro + "]";
	}
	
	
}
