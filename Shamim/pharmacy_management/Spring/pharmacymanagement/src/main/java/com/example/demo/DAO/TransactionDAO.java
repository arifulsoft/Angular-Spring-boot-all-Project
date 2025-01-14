package com.example.demo.DAO;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.demo.Entity.Accounts;
import com.example.demo.Entity.Transaction;

public class TransactionDAO extends MySqlConnection {
	public void saveTrnsaction(Transaction acc) {
		Accounts accounts = new Accounts();
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String format = dateFormat.format(date);
		java.sql.Date transactionDate = java.sql.Date.valueOf(format);
		System.out.println(date);
		System.out.println(transactionDate);
		System.out.println(acc);
		try {
			con = DriverManager.getConnection(url, user, pass);

			ps = con.prepareStatement("insert into taransaction values (?,?,?,?,?,?,?)");
//			create table taransaction(transactionId int primary key auto_increment, transactionDate date , purpose varchar(255), transactionType varchar(255), ammount double);

			ps.setInt(1, acc.getTransactionId());
			ps.setDate(2, transactionDate);
			ps.setString(3, acc.getInvoice_no());
			ps.setString(4, acc.getPurpose());
			ps.setString(5, acc.getTransactionType());
			ps.setDouble(6, acc.getAmmount());

			

				PreparedStatement psgetacc = con.prepareStatement("select * from accounts where acc_type='main'");
				rs = psgetacc.executeQuery();
				while (rs.next()) {
					accounts = new Accounts(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4),
							rs.getDouble(5), rs.getDouble(6));
				}
				System.out.println(accounts);
				System.out.println(acc.getTransactionType().equals("Credit"));
				if (acc.getTransactionType().equals("Credit")) {
//				System.out.println("Credit");
					Double newbalance = accounts.getCredit() + acc.getAmmount();
					Double total = accounts.getBalance() + acc.getAmmount();
					PreparedStatement psupdtacc = con.prepareStatement("update accounts set credit=" + newbalance
							+ ", balance=" + total + " where account_no=" + accounts.getAcc_no());
					psupdtacc.executeUpdate();
					System.out.println(newbalance);
					System.out.println(total);
					ps.setDouble(7, total);
				} else if (acc.getTransactionType().equals("Debit")) {
					System.out.println("Debit");
					Double newbalance = accounts.getDebit() + acc.getAmmount();
					Double total = accounts.getBalance() - acc.getAmmount();
					PreparedStatement psupdtacc = con.prepareStatement("update accounts set credit=" + newbalance
							+ ", balance=" + total + " where account_no=" + accounts.getAcc_no());
					psupdtacc.executeUpdate();
					System.out.println(newbalance);
					System.out.println(total);
					ps.setDouble(7, total);
				}
			
			ps.executeUpdate();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	//=======================================get transaction data===============================
	
	List<Transaction> t;
	public List<Transaction> getTransactionReport(java.sql.Date startDate, java.sql.Date endDate){
		t=new ArrayList<>();
		
		try {
			con = DriverManager.getConnection(url, user, pass);
			ps=con.prepareStatement("select * from taransaction where transactionDate between ? and ?");
			ps.setDate(1, startDate);
			ps.setDate(2, endDate);
			rs=ps.executeQuery();
//			Transaction(int transactionId, Date transactionDate, String invoice_no, String purpose,
//					String transactionType, double ammount, double balance)
			while(rs.next()) {
				t.add(new Transaction(rs.getInt(1),rs.getDate(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDouble(6),rs.getDouble(7)));
			}
		} catch (Exception e) {
			System.out.println("Transaction report "+e);
		}
		
		return t;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
