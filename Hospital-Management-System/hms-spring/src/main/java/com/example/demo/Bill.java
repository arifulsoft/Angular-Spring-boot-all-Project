package com.example.demo;

import java.sql.Date;

public class Bill {
	int id;
	int p_id;
	Date ad_date;
	double t_charge;
	double paid;
	double due;
	String status;
	Date dischargeDate;
	
	public Bill() {
		super();
	}

	public Bill(int id, int p_id, Date ad_date, double t_charge, double paid, double due, String status,
			Date dischargeDate) {
		super();
		this.id = id;
		this.p_id = p_id;
		this.ad_date = ad_date;
		this.t_charge = t_charge;
		this.paid = paid;
		this.due = due;
		this.status = status;
		this.dischargeDate = dischargeDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public Date getAd_date() {
		return ad_date;
	}

	public void setAd_date(Date ad_date) {
		this.ad_date = ad_date;
	}

	public double getT_charge() {
		return t_charge;
	}

	public void setT_charge(double t_charge) {
		this.t_charge = t_charge;
	}

	public double getPaid() {
		return paid;
	}

	public void setPaid(double paid) {
		this.paid = paid;
	}

	public double getDue() {
		return due;
	}

	public void setDue(double due) {
		this.due = due;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDischargeDate() {
		return dischargeDate;
	}

	public void setDischargeDate(Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", p_id=" + p_id + ", ad_date=" + ad_date + ", t_charge=" + t_charge + ", paid="
				+ paid + ", due=" + due + ", status=" + status + ", dischargeDate=" + dischargeDate + ", getId()="
				+ getId() + ", getP_id()=" + getP_id() + ", getAd_date()=" + getAd_date() + ", getT_charge()="
				+ getT_charge() + ", getPaid()=" + getPaid() + ", getDue()=" + getDue() + ", getStatus()=" + getStatus()
				+ ", getDischargeDate()=" + getDischargeDate() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}