package com.example.demo;

import java.sql.Date;

public class Booking_approval_table {
// nid, name, mobile_number, from, to, car_number, booking_date, total_day, total_rent, due_rent, status
	int nid;
	String	name;
	String	mobile_number;
	String from;
	String to;
	String car_number;
	java.sql.Date booking_date;
	int total_day;
	int total_rent;
	int due_rent;
	int advance_payment;
	String status;
	
	public Booking_approval_table() {
		super();
	}

	public Booking_approval_table(int nid, String name, String mobile_number, String from, String to, String car_number,
			Date booking_date, int total_day, int total_rent, int due_rent, int advance_payment, String status) {
		super();
		this.nid = nid;
		this.name = name;
		this.mobile_number = mobile_number;
		this.from = from;
		this.to = to;
		this.car_number = car_number;
		this.booking_date = booking_date;
		this.total_day = total_day;
		this.total_rent = total_rent;
		this.due_rent = due_rent;
		this.advance_payment = advance_payment;
		this.status = status;
	}

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
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

	public String getCar_number() {
		return car_number;
	}

	public void setCar_number(String car_number) {
		this.car_number = car_number;
	}

	public java.sql.Date getBooking_date() {
		return booking_date;
	}

	public void setBooking_date(java.sql.Date booking_date) {
		this.booking_date = booking_date;
	}

	public int getTotal_day() {
		return total_day;
	}

	public void setTotal_day(int total_day) {
		this.total_day = total_day;
	}

	public int getTotal_rent() {
		return total_rent;
	}

	public void setTotal_rent(int total_rent) {
		this.total_rent = total_rent;
	}

	public int getDue_rent() {
		return due_rent;
	}

	public void setDue_rent(int due_rent) {
		this.due_rent = due_rent;
	}

	public int getAdvance_payment() {
		return advance_payment;
	}

	public void setAdvance_payment(int advance_payment) {
		this.advance_payment = advance_payment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Booking_approval_table [nid=" + nid + ", name=" + name + ", mobile_number=" + mobile_number + ", from="
				+ from + ", to=" + to + ", car_number=" + car_number + ", booking_date=" + booking_date + ", total_day="
				+ total_day + ", total_rent=" + total_rent + ", due_rent=" + due_rent + ", advance_payment="
				+ advance_payment + ", status=" + status + ", getNid()=" + getNid() + ", getName()=" + getName()
				+ ", getMobile_number()=" + getMobile_number() + ", getFrom()=" + getFrom() + ", getTo()=" + getTo()
				+ ", getCar_number()=" + getCar_number() + ", getBooking_date()=" + getBooking_date()
				+ ", getTotal_day()=" + getTotal_day() + ", getTotal_rent()=" + getTotal_rent() + ", getDue_rent()="
				+ getDue_rent() + ", getAdvance_payment()=" + getAdvance_payment() + ", getStatus()=" + getStatus()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
