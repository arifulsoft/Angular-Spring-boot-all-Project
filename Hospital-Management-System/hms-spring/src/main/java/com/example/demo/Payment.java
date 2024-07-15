package com.example.demo;

import java.sql.Date;

public class Payment {
	int id;
	int p_id;
	String p_name;
	String d_id;
	String age;
	String phone;
	double c_fee;
	double pdbc;
	double tbc;
	double m_bill;
	double t_charge;
	double vat;
	double t_amt;
	double discount;
	double n_amt;
	Date date;
	double admissionCharge;
	
	public Payment() {
		super();
	}

	public Payment(int p_id, String p_name, String d_id, String age, String phone, double c_fee, double pdbc,
			double tbc, double m_bill, double t_charge, double vat, double t_amt, double discount, double n_amt,
			Date date, double admissionCharge) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.d_id = d_id;
		this.age = age;
		this.phone = phone;
		this.c_fee = c_fee;
		this.pdbc = pdbc;
		this.tbc = tbc;
		this.m_bill = m_bill;
		this.t_charge = t_charge;
		this.vat = vat;
		this.t_amt = t_amt;
		this.discount = discount;
		this.n_amt = n_amt;
		this.date = date;
		this.admissionCharge = admissionCharge;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getD_id() {
		return d_id;
	}

	public void setD_id(String d_id) {
		this.d_id = d_id;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getC_fee() {
		return c_fee;
	}

	public void setC_fee(double c_fee) {
		this.c_fee = c_fee;
	}

	public double getPdbc() {
		return pdbc;
	}

	public void setPdbc(double pdbc) {
		this.pdbc = pdbc;
	}

	public double getTbc() {
		return tbc;
	}

	public void setTbc(double tbc) {
		this.tbc = tbc;
	}

	public double getM_bill() {
		return m_bill;
	}

	public void setM_bill(double m_bill) {
		this.m_bill = m_bill;
	}

	public double getT_charge() {
		return t_charge;
	}

	public void setT_charge(double t_charge) {
		this.t_charge = t_charge;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public double getT_amt() {
		return t_amt;
	}

	public void setT_amt(double t_amt) {
		this.t_amt = t_amt;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getN_amt() {
		return n_amt;
	}

	public void setN_amt(double n_amt) {
		this.n_amt = n_amt;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getAdmissionCharge() {
		return admissionCharge;
	}

	public void setAdmissionCharge(double admissionCharge) {
		this.admissionCharge = admissionCharge;
	}

	@Override
	public String toString() {
		return "Payment [p_id=" + p_id + ", p_name=" + p_name + ", d_id=" + d_id + ", age=" + age + ", phone=" + phone
				+ ", c_fee=" + c_fee + ", pdbc=" + pdbc + ", tbc=" + tbc + ", m_bill=" + m_bill + ", t_charge="
				+ t_charge + ", vat=" + vat + ", t_amt=" + t_amt + ", discount=" + discount + ", n_amt=" + n_amt
				+ ", date=" + date + ", admissionCharge=" + admissionCharge + ", getP_id()=" + getP_id()
				+ ", getP_name()=" + getP_name() + ", getD_id()=" + getD_id() + ", getAge()=" + getAge()
				+ ", getPhone()=" + getPhone() + ", getC_fee()=" + getC_fee() + ", getPdbc()=" + getPdbc()
				+ ", getTbc()=" + getTbc() + ", getM_bill()=" + getM_bill() + ", getT_charge()=" + getT_charge()
				+ ", getVat()=" + getVat() + ", getT_amt()=" + getT_amt() + ", getDiscount()=" + getDiscount()
				+ ", getN_amt()=" + getN_amt() + ", getDate()=" + getDate() + ", getAdmissionCharge()="
				+ getAdmissionCharge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
