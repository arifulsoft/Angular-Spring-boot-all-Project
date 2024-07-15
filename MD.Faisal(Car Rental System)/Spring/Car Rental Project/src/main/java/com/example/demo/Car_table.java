package com.example.demo;

public class Car_table {
	
	int serial_no;
	String car_name;
	String car_number;
	String car_color;
	int car_seating;
	String	 car_image;
	double rent_per_day;
	int quantity;
	long total;
	
	public Car_table() {
		super();
	}

	public Car_table(int serial_no, String car_name, String car_number, String car_color, int car_seating,
			String car_image, double rent_per_day, int quantity, long total) {
		super();
		this.serial_no = serial_no;
		this.car_name = car_name;
		this.car_number = car_number;
		this.car_color = car_color;
		this.car_seating = car_seating;
		this.car_image = car_image;
		this.rent_per_day = rent_per_day;
		this.quantity = quantity;
		this.total = total;
	}

	public int getSerial_no() {
		return serial_no;
	}

	public void setSerial_no(int serial_no) {
		this.serial_no = serial_no;
	}

	public String getCar_name() {
		return car_name;
	}

	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	public String getCar_number() {
		return car_number;
	}

	public void setCar_number(String car_number) {
		this.car_number = car_number;
	}

	public String getCar_color() {
		return car_color;
	}

	public void setCar_color(String car_color) {
		this.car_color = car_color;
	}

	public int getCar_seating() {
		return car_seating;
	}

	public void setCar_seating(int car_seating) {
		this.car_seating = car_seating;
	}

	public String getCar_image() {
		return car_image;
	}

	public void setCar_image(String car_image) {
		this.car_image = car_image;
	}

	public double getRent_per_day() {
		return rent_per_day;
	}

	public void setRent_per_day(double rent_per_day) {
		this.rent_per_day = rent_per_day;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Car_table [serial_no=" + serial_no + ", car_name=" + car_name + ", car_number=" + car_number
				+ ", car_color=" + car_color + ", car_seating=" + car_seating + ", car_image=" + car_image
				+ ", rent_per_day=" + rent_per_day + ", quantity=" + quantity + ", total=" + total + ", getSerial_no()="
				+ getSerial_no() + ", getCar_name()=" + getCar_name() + ", getCar_number()=" + getCar_number()
				+ ", getCar_color()=" + getCar_color() + ", getCar_seating()=" + getCar_seating() + ", getCar_image()="
				+ getCar_image() + ", getRent_per_day()=" + getRent_per_day() + ", getQuantity()=" + getQuantity()
				+ ", getTotal()=" + getTotal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	

}
