package com.example.demo;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mystery implements Serializable{
	@Id
	int number;
	String name;
	String writer;
	String image;
	String stock;
	String categoryname;
	String bookshelf;
	
	public Mystery() {
		super();
	}
	public Mystery(int number, String name, String writer, String image, String stock, String categoryname,
			String bookshelf) {
		super();
		this.number = number;
		this.name = name;
		this.writer = writer;
		this.image = image;
		this.stock = stock;
		this.categoryname = categoryname;
		this.bookshelf = bookshelf;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getBookshelf() {
		return bookshelf;
	}
	public void setBookshelf(String bookshelf) {
		this.bookshelf = bookshelf;
	}
	@Override
	public String toString() {
		return "Mystery [number=" + number + ", name=" + name + ", writer=" + writer + ", image=" + image + ", stock="
				+ stock + ", categoryname=" + categoryname + ", bookshelf=" + bookshelf + ", getNumber()=" + getNumber()
				+ ", getName()=" + getName() + ", getWriter()=" + getWriter() + ", getImage()=" + getImage()
				+ ", getStock()=" + getStock() + ", getCategoryname()=" + getCategoryname() + ", getBookshelf()="
				+ getBookshelf() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
