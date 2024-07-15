package com.example.demo;

import java.sql.Date;

public class PaymentDes {
	
	int desId;
	int p_id;
	Date p_date;
	double amount;
	
	
	
	public PaymentDes() {
		super();
	}



	public PaymentDes(int desId, int p_id, Date p_date, double amount) {
		super();
		this.desId = desId;
		this.p_id = p_id;
		this.p_date = p_date;
		this.amount = amount;
	}



	public int getDesId() {
		return desId;
	}



	public void setDesId(int desId) {
		this.desId = desId;
	}



	public int getP_id() {
		return p_id;
	}



	public void setP_id(int p_id) {
		this.p_id = p_id;
	}



	public Date getP_date() {
		return p_date;
	}



	public void setP_date(Date p_date) {
		this.p_date = p_date;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	@Override
	public String toString() {
		return "PaymentDes [desId=" + desId + ", p_id=" + p_id + ", p_date=" + p_date + ", amount=" + amount
				+ ", getDesId()=" + getDesId() + ", getP_id()=" + getP_id() + ", getP_date()=" + getP_date()
				+ ", getAmount()=" + getAmount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
