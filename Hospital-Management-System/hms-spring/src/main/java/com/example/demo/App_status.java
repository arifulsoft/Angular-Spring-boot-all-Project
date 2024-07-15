package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class App_status {
//	p_id, d_name, department, c_fee, status, payment
	@Id
	String p_id;
	String d_name;
	String department;
	int c_fee;
	String status;
	String payment;
	public App_status() {
		super();
	}
	public App_status(String p_id, String d_name, String department, int c_fee, String status, String payment) {
		super();
		this.p_id = p_id;
		this.d_name = d_name;
		this.department = department;
		this.c_fee = c_fee;
		this.status = status;
		this.payment = payment;
	}
	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getC_fee() {
		return c_fee;
	}
	public void setC_fee(int c_fee) {
		this.c_fee = c_fee;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "App_status [p_id=" + p_id + ", d_name=" + d_name + ", department=" + department + ", c_fee=" + c_fee
				+ ", status=" + status + ", payment=" + payment + ", getP_id()=" + getP_id() + ", getD_name()="
				+ getD_name() + ", getDepartment()=" + getDepartment() + ", getC_fee()=" + getC_fee() + ", getStatus()="
				+ getStatus() + ", getPayment()=" + getPayment() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
