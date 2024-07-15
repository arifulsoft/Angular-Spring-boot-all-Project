package com.example.demo;

import java.sql.Date;

public class BillSum {

	int id;
	String p_id;
	String p_name;
	String phone;
	Date ad_date;
	Date dis_date;
	int tnad;
	Double ad_amt;
	Double pdbc;
	Double tbc;
	Double doc_fee;
	Double m_bill;
	Double t_bill;
	Double total;
	Double discount;
	Double n_amt;
	Double paid;
	String status;
	
	public BillSum() {
		super();
	}

	public BillSum(int id, String p_id, String p_name, String phone, Date ad_date, Date dis_date, int tnad,
			Double ad_amt, Double pdbc, Double tbc, Double doc_fee, Double m_bill, Double t_bill, Double total,
			Double discount, Double n_amt, Double paid, String status) {
		super();
		this.id = id;
		this.p_id = p_id;
		this.p_name = p_name;
		this.phone = phone;
		this.ad_date = ad_date;
		this.dis_date = dis_date;
		this.tnad = tnad;
		this.ad_amt = ad_amt;
		this.pdbc = pdbc;
		this.tbc = tbc;
		this.doc_fee = doc_fee;
		this.m_bill = m_bill;
		this.t_bill = t_bill;
		this.total = total;
		this.discount = discount;
		this.n_amt = n_amt;
		this.paid = paid;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getP_id() {
		return p_id;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getAd_date() {
		return ad_date;
	}

	public void setAd_date(Date ad_date) {
		this.ad_date = ad_date;
	}

	public Date getDis_date() {
		return dis_date;
	}

	public void setDis_date(Date dis_date) {
		this.dis_date = dis_date;
	}

	public int getTnad() {
		return tnad;
	}

	public void setTnad(int tnad) {
		this.tnad = tnad;
	}

	public Double getAd_amt() {
		return ad_amt;
	}

	public void setAd_amt(Double ad_amt) {
		this.ad_amt = ad_amt;
	}

	public Double getPdbc() {
		return pdbc;
	}

	public void setPdbc(Double pdbc) {
		this.pdbc = pdbc;
	}

	public Double getTbc() {
		return tbc;
	}

	public void setTbc(Double tbc) {
		this.tbc = tbc;
	}

	public Double getDoc_fee() {
		return doc_fee;
	}

	public void setDoc_fee(Double doc_fee) {
		this.doc_fee = doc_fee;
	}

	public Double getM_bill() {
		return m_bill;
	}

	public void setM_bill(Double m_bill) {
		this.m_bill = m_bill;
	}

	public Double getT_bill() {
		return t_bill;
	}

	public void setT_bill(Double t_bill) {
		this.t_bill = t_bill;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getN_amt() {
		return n_amt;
	}

	public void setN_amt(Double n_amt) {
		this.n_amt = n_amt;
	}

	public Double getPaid() {
		return paid;
	}

	public void setPaid(Double paid) {
		this.paid = paid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BillSum [id=" + id + ", p_id=" + p_id + ", p_name=" + p_name + ", phone=" + phone + ", ad_date="
				+ ad_date + ", dis_date=" + dis_date + ", tnad=" + tnad + ", ad_amt=" + ad_amt + ", pdbc=" + pdbc
				+ ", tbc=" + tbc + ", doc_fee=" + doc_fee + ", m_bill=" + m_bill + ", t_bill=" + t_bill + ", total="
				+ total + ", discount=" + discount + ", n_amt=" + n_amt + ", paid=" + paid + ", status=" + status
				+ ", getId()=" + getId() + ", getP_id()=" + getP_id() + ", getP_name()=" + getP_name() + ", getPhone()="
				+ getPhone() + ", getAd_date()=" + getAd_date() + ", getDis_date()=" + getDis_date() + ", getTnad()="
				+ getTnad() + ", getAd_amt()=" + getAd_amt() + ", getPdbc()=" + getPdbc() + ", getTbc()=" + getTbc()
				+ ", getDoc_fee()=" + getDoc_fee() + ", getM_bill()=" + getM_bill() + ", getT_bill()=" + getT_bill()
				+ ", getTotal()=" + getTotal() + ", getDiscount()=" + getDiscount() + ", getN_amt()=" + getN_amt()
				+ ", getPaid()=" + getPaid() + ", getStatus()=" + getStatus() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}