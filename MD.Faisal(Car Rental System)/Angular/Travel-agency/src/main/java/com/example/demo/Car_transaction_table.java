package com.example.demo;

import java.sql.Date;

public class Car_transaction_table {
	int serial_no;
	String car_name;
	String car_number;
	String from;
	String to;
	java.sql.Date booking_date;
	java.sql.Date return_date;
	double total_rent;
	String customer_name;
	int customer_nid;
	int customer_mobile_no;
	int total_days;
	double advance_payment;

	public Car_transaction_table() {
		super();
	}

	public Car_transaction_table(int serial_no, String car_name, String car_number, String from, String to,
			Date booking_date, Date return_date, double total_rent, String customer_name, int customer_nid,
			int customer_mobile_no, int total_days, double advance_payment) {
		super();
		this.serial_no = serial_no;
		this.car_name = car_name;
		this.car_number = car_number;
		this.from = from;
		this.to = to;
		this.booking_date = booking_date;
		this.return_date = return_date;
		this.total_rent = total_rent;
		this.customer_name = customer_name;
		this.customer_nid = customer_nid;
		this.customer_mobile_no = customer_mobile_no;
		this.total_days = total_days;
		this.advance_payment = advance_payment;
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

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public java.sql.Date getBooking_date() {
		return booking_date;
	}

	public void setBooking_date(java.sql.Date booking_date) {
		this.booking_date = booking_date;
	}

	public java.sql.Date getReturn_date() {
		return return_date;
	}

	public void setReturn_date(java.sql.Date return_date) {
		this.return_date = return_date;
	}

	public double getTotal_rent() {
		return total_rent;
	}

	public void setTotal_rent(double total_rent) {
		this.total_rent = total_rent;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public int getCustomer_nid() {
		return customer_nid;
	}

	public void setCustomer_nid(int customer_nid) {
		this.customer_nid = customer_nid;
	}

	public int getCustomer_mobile_no() {
		return customer_mobile_no;
	}

	public void setCustomer_mobile_no(int customer_mobile_no) {
		this.customer_mobile_no = customer_mobile_no;
	}

	public int getTotal_days() {
		return total_days;
	}

	public void setTotal_days(int total_days) {
		this.total_days = total_days;
	}

	public double getAdvance_payment() {
		return advance_payment;
	}

	public void setAdvance_payment(double advance_payment) {
		this.advance_payment = advance_payment;
	}

	@Override
	public String toString() {
		return "Car_transaction_table [serial_no=" + serial_no + ", car_name=" + car_name + ", car_number=" + car_number
				+ ", from=" + from + ", to=" + to + ", booking_date=" + booking_date + ", return_date=" + return_date
				+ ", total_rent=" + total_rent + ", customer_name=" + customer_name + ", customer_nid=" + customer_nid
				+ ", customer_mobile_no=" + customer_mobile_no + ", total_days=" + total_days + ", advance_payment="
				+ advance_payment + "]";
	}

	
	
}
