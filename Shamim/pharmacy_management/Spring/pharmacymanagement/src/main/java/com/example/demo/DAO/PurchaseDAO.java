package com.example.demo.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.example.demo.Controller;
import com.example.demo.Entity.Purchase;
import com.example.demo.Entity.Transaction;

public class PurchaseDAO extends MySqlConnection{
	Transaction t;
	Controller c;
//	int purshasId;
//	Date pursDate;
//	int supllierId;
//	String medicineName;
//	int paking;
//	String genericName;
//	String batchId;
//	Date exDate;
//	int qty;
//	String mrp;
//	double purchaseRate;
//	String invoice;

	public void createPurchase(List<Purchase> u) {
		t=new Transaction();
		c= new Controller();
		Double ammount=0.0;
		String invoice="";
		try {
			con = DriverManager.getConnection(url, user, pass);
			for(int i=0;i<u.size();i++) {
			 ps= con.prepareStatement("insert into purshase values (?,?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setInt(1, u.get(i).getPurshasId());
			ps.setDate(2, u.get(i).getPursDate());
			ps.setInt(3, u.get(i).getSupllierId());
			ps.setString(4, u.get(i).getMedicineName());
			ps.setInt(5, u.get(i).getPaking());
			ps.setString(6, u.get(i).getGenericName());
			ps.setString(7, u.get(i).getBatchId());
			ps.setDate(8, u.get(i).getExDate());
			ps.setInt(9, u.get(i).getQty());
			ps.setString(10, u.get(i).getMrp());
			ps.setDouble(11, u.get(i).getPurchaseRate());
			ps.setString(12, u.get(i).getInvoice());
			invoice=u.get(i).getInvoice();
			ammount=ammount+((u.get(i).getQty()/u.get(i).getPaking())*u.get(i).getPurchaseRate());
			ps.executeUpdate();
			}
			t.setTransactionId(0);
			t.setInvoice_no(invoice);
			t.setPurpose("Sale");
			t.setTransactionType("Debit");
			t.setAmmount(ammount);
			c.saveTransaction(t);
			con.close();
			
			
		}catch(Exception e ) {
			System.out.println("Save new Purchase"+e);
		}
	}


}
