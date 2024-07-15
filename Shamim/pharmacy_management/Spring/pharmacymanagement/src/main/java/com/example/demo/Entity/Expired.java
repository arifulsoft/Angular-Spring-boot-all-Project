package com.example.demo.Entity;

import java.sql.Date;

public class Expired {
	int expiredId;
	Date insertDate;
	String supplier; 
	String medicineName; 
	int paking;
	String genericName; 
	String batchId; 
	Date exDate ; 
	Date pursDate ; 
	String invoice; 
	int returnQty; 
	double purchaseRate;
	String status;
	int purchasId ;
	

	public Expired() {
		super();
	}


	public Expired(int expiredId, Date insertDate, String supplier, String medicineName, int paking, String genericName,
			String batchId, Date exDate, Date pursDate, String invoice, int returnQty, double purchaseRate,
			String status, int purchasId) {
		super();
		this.expiredId = expiredId;
		this.insertDate = insertDate;
		this.supplier = supplier;
		this.medicineName = medicineName;
		this.paking = paking;
		this.genericName = genericName;
		this.batchId = batchId;
		this.exDate = exDate;
		this.pursDate = pursDate;
		this.invoice = invoice;
		this.returnQty = returnQty;
		this.purchaseRate = purchaseRate;
		this.status = status;
		this.purchasId = purchasId;
	}


	public int getExpiredId() {
		return expiredId;
	}


	public void setExpiredId(int expiredId) {
		this.expiredId = expiredId;
	}


	public Date getInsertDate() {
		return insertDate;
	}


	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}


	public String getSupplier() {
		return supplier;
	}


	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}


	public String getMedicineName() {
		return medicineName;
	}


	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}


	public int getPaking() {
		return paking;
	}


	public void setPaking(int paking) {
		this.paking = paking;
	}


	public String getGenericName() {
		return genericName;
	}


	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}


	public String getBatchId() {
		return batchId;
	}


	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}


	public Date getExDate() {
		return exDate;
	}


	public void setExDate(Date exDate) {
		this.exDate = exDate;
	}


	public Date getPursDate() {
		return pursDate;
	}


	public void setPursDate(Date pursDate) {
		this.pursDate = pursDate;
	}


	public String getInvoice() {
		return invoice;
	}


	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}


	public int getReturnQty() {
		return returnQty;
	}


	public void setReturnQty(int returnQty) {
		this.returnQty = returnQty;
	}


	public double getPurchaseRate() {
		return purchaseRate;
	}


	public void setPurchaseRate(double purchaseRate) {
		this.purchaseRate = purchaseRate;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getPurchasId() {
		return purchasId;
	}


	public void setPurchasId(int purchasId) {
		this.purchasId = purchasId;
	}


	@Override
	public String toString() {
		return "Expired [expiredId=" + expiredId + ", insertDate=" + insertDate + ", supplier=" + supplier
				+ ", medicineName=" + medicineName + ", paking=" + paking + ", genericName=" + genericName
				+ ", batchId=" + batchId + ", exDate=" + exDate + ", pursDate=" + pursDate + ", invoice=" + invoice
				+ ", returnQty=" + returnQty + ", purchaseRate=" + purchaseRate + ", status=" + status + ", purchasId="
				+ purchasId + "]";
	}
	
	
	

}
