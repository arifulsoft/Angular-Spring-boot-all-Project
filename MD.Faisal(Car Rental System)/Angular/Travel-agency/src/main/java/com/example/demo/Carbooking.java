package com.example.demo;

import java.sql.Date;

public class Carbooking {

	int nid;
	String name;
	String m_number;
	String from;
	String to;
	String car_name;
	String car_number;
	int car_seating;
	int rent_per_day;
	int total_day;
	int amount;
	java.sql.Date booking_date;
	java.sql.Date return_date;
	int advance_payment;
	int due;
	
	public Carbooking() {
		super();
	}
	public Carbooking(int nid, String name, String m_number, String from, String to, String car_name, String car_number,
			int car_seating, int rent_per_day, int total_day, int amount, Date booking_date, Date return_date,
			int advance_payment, int due) {
		super();
		this.nid = nid;
		this.name = name;
		this.m_number = m_number;
		this.from = from;
		this.to = to;
		this.car_name = car_name;
		this.car_number = car_number;
		this.car_seating = car_seating;
		this.rent_per_day = rent_per_day;
		this.total_day = total_day;
		this.amount = amount;
		this.booking_date = booking_date;
		this.return_date = return_date;
		this.advance_payment = advance_payment;
		this.due = due;
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
	public String getM_number() {
		return m_number;
	}
	public void setM_number(String m_number) {
		this.m_number = m_number;
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
	public int getCar_seating() {
		return car_seating;
	}
	public void setCar_seating(int car_seating) {
		this.car_seating = car_seating;
	}
	public int getRent_per_day() {
		return rent_per_day;
	}
	public void setRent_per_day(int rent_per_day) {
		this.rent_per_day = rent_per_day;
	}
	public int getTotal_day() {
		return total_day;
	}
	public void setTotal_day(int total_day) {
		this.total_day = total_day;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
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
	public int getAdvance_payment() {
		return advance_payment;
	}
	public void setAdvance_payment(int advance_payment) {
		this.advance_payment = advance_payment;
	}
	public int getDue() {
		return due;
	}
	public void setDue(int due) {
		this.due = due;
	}
	@Override
	public String toString() {
		return "Carbooking [nid=" + nid + ", name=" + name + ", m_number=" + m_number + ", from=" + from + ", to=" + to
				+ ", car_name=" + car_name + ", car_number=" + car_number + ", car_seating=" + car_seating
				+ ", rent_per_day=" + rent_per_day + ", total_day=" + total_day + ", amount=" + amount
				+ ", booking_date=" + booking_date + ", return_date=" + return_date + ", advance_payment="
				+ advance_payment + ", due=" + due + "]";
	}
	

}
