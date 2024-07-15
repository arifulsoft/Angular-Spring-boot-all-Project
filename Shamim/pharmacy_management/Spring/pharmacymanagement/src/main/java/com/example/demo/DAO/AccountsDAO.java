package com.example.demo.DAO;

import java.sql.DriverManager;

import com.example.demo.Entity.Accounts;

public class AccountsDAO extends MySqlConnection {

	public void saveAccounts(Accounts acc) {
	try {
		con=DriverManager.getConnection( url,user,pass);  
//		int accId;
//		double debit;
//		double credit;
//		double balance;
//		
		ps= con.prepareStatement("insert into accounts values (?,?,?,?)");

		ps.setInt(1, acc.getAccId());
		ps.setDouble(2, acc.getDebit());
		ps.setDouble(3, acc.getCredit());
		ps.setDouble(4, acc.getBalance());
		ps.executeUpdate();
		con.close();
		
		
	}catch(Exception e ) {
		System.out.println(e);
	}

}
	
	// get accounts report====================================
	Accounts accounts;
	public Accounts getDetails() {
		accounts=new Accounts();
		try {
			con=DriverManager.getConnection( url,user,pass);  
			ps= con.prepareStatement("select * from accounts");
			rs=ps.executeQuery();
			while(rs.next()) {
				accounts=new Accounts(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getDouble(5),rs.getDouble(6));
				
			}
			
		}catch (Exception e) {
			System.out.println("accounts details"+e);
		}
		
		return accounts;
		
	}
	
	
}
