package com.example.demo;

public class Loan {
	
	int number;
	String username;
	String userid;
	String bookname;
	String booknumber;
	String image;
	String categoryname;
	String bookshelf;
	public Loan() {
		super();
	}
	public Loan(int number, String username, String userid, String bookname, String booknumber, String image,
			String categoryname, String bookshelf) {
		super();
		this.number = number;
		this.username = username;
		this.userid = userid;
		this.bookname = bookname;
		this.booknumber = booknumber;
		this.image = image;
		this.categoryname = categoryname;
		this.bookshelf = bookshelf;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBooknumber() {
		return booknumber;
	}
	public void setBooknumber(String booknumber) {
		this.booknumber = booknumber;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
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
		return "Loan [number=" + number + ", username=" + username + ", userid=" + userid + ", bookname=" + bookname
				+ ", booknumber=" + booknumber + ", image=" + image + ", categoryname=" + categoryname + ", bookshelf="
				+ bookshelf + ", getNumber()=" + getNumber() + ", getUsername()=" + getUsername() + ", getUserid()="
				+ getUserid() + ", getBookname()=" + getBookname() + ", getBooknumber()=" + getBooknumber()
				+ ", getImage()=" + getImage() + ", getCategoryname()=" + getCategoryname() + ", getBookshelf()="
				+ getBookshelf() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
