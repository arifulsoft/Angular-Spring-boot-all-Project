package com.example.demo.DAO;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.example.demo.Controller;
import com.example.demo.Entity.Sale;
import com.example.demo.Entity.Transaction;

public class SaleDAO extends MySqlConnection {
	Transaction t;
	Controller c;

	public String createSale(List<Sale> u) {
		t=new Transaction();
		c= new Controller();
		Double ammount=0.0;
		System.out.println("Invoice No => " + u.get(0).getInvoice_no());
		int saveData = 0;
		String invoice = null;
		if (u.get(0).getInvoice_no() == null) {

			try {
				con = DriverManager.getConnection(url, user, pass);
//				PreparedStatement psresult = con.prepareStatement("select invoice_no from sale");
//				rs = psresult.executeQuery();
//				while (rs.next()) {
//					invoice = rs.getString(1);
//
//				}
//				invoice = String.valueOf(Integer.parseInt(invoice) + 1);
				Date date = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
				invoice = dateFormat.format(date);
				System.out.println("invoice no = " + invoice);
				for (int i = 0; i < u.size(); i++) {
					ammount=ammount+u.get(i).getTotal();
					PreparedStatement ps = con.prepareStatement("insert into sale values (?,?,?,?,?,?,?,?)");
					ps.setInt(1, u.get(i).getSaleId());
					ps.setInt(2, u.get(i).getStockId());
					ps.setInt(3, u.get(i).getQty());
					ps.setDouble(4, u.get(i).getRate());
					ps.setDouble(5, u.get(i).getTotal());
					ps.setDate(6, u.get(i).getSaleDate());
					ps.setInt(7, u.get(i).getCustomerId());
					ps.setString(8, invoice);
//					ps.setString(9, u.get(i).getStatus());

//					String ststus;
					int check = ps.executeUpdate();
					saveData = saveData + check;
				}
				System.out.println("Save Sale " + saveData);
//				ps.setInt(1, acc.getTransactionId());
//				ps.setDate(2, transactionDate);
//				ps.setString(3, acc.getInvoice_no());
//				ps.setString(4, acc.getPurpose());
//				ps.setString(5, acc.getTransactionType());
//				ps.setDouble(6, acc.getAmmount());
				
				t.setTransactionId(0);
				t.setInvoice_no(invoice);
				t.setPurpose("Sale");
				t.setTransactionType("Credit");
				t.setAmmount(ammount);
				c.saveTransaction(t);

				con.close();

			} catch (Exception e) {
				System.out.println("Sale Dao " + e);
			}

		} else {
			try {
				con = DriverManager.getConnection(url, user, pass);
				for (int i = 0; i < u.size(); i++) {
					PreparedStatement ps = con.prepareStatement("insert into sale values (?,?,?,?,?,?,?,?)");
					ps.setInt(1, u.get(i).getSaleId());
					ps.setInt(2, u.get(i).getStockId());
					ps.setInt(3, u.get(i).getQty());
					ps.setDouble(4, u.get(i).getRate());
					ps.setDouble(5, u.get(i).getTotal());
					ps.setDate(6, u.get(i).getSaleDate());
					ps.setInt(7, u.get(i).getCustomerId());
					ps.setString(8, u.get(i).getInvoice_no());
//				ps.setString(9, u.get(i).getStatus());

//					String ststus;
					int check = ps.executeUpdate();
					saveData = saveData + check;
				}
				t.setTransactionId(0);
				t.setInvoice_no(invoice);
				t.setPurpose("Sale");
				t.setTransactionType("Credit");
				t.setAmmount(ammount);
				c.saveTransaction(t);
			} catch (Exception e) {
				System.out.println("Sale Dao else " + e);
			}
		}
		System.out.println("Sale Dao return invoice  " + invoice);
		return invoice;
	}

}
