package com.example.Entity;

public class LaunchProduct {
	
	int pro_id;
	String pro_name;
	double pro_price;
	int pro_quantity;
	String pro_image;
	
	
	public LaunchProduct() {
		super();
	}


	public LaunchProduct(int pro_id, String pro_name, double pro_price, int pro_quantity, String pro_image) {
		super();
		this.pro_id = pro_id;
		this.pro_name = pro_name;
		this.pro_price = pro_price;
		this.pro_quantity = pro_quantity;
		this.pro_image = pro_image;
	}


	public int getPro_id() {
		return pro_id;
	}


	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}


	public String getPro_name() {
		return pro_name;
	}


	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}


	public double getPro_price() {
		return pro_price;
	}


	public void setPro_price(double pro_price) {
		this.pro_price = pro_price;
	}


	public int getPro_quantity() {
		return pro_quantity;
	}


	public void setPro_quantity(int pro_quantity) {
		this.pro_quantity = pro_quantity;
	}


	public String getPro_image() {
		return pro_image;
	}


	public void setPro_image(String pro_image) {
		this.pro_image = pro_image;
	}


	@Override
	public String toString() {
		return "LunchProduct [pro_id=" + pro_id + ", pro_name=" + pro_name + ", pro_price=" + pro_price
				+ ", pro_quantity=" + pro_quantity + ", pro_image=" + pro_image + "]";
	}
	
	
	

}
