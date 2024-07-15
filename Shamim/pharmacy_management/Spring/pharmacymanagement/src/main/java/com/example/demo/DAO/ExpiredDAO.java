package com.example.demo.DAO;

import java.sql.Date;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Entity.Expired;

public class ExpiredDAO extends MySqlConnection{
	List<Expired> e;
	List<Expired> expiredData;

	public List<Expired> saveExpired() {
		e=new ArrayList<>();
		expiredData=new ArrayList<>();
		try {
			con = DriverManager.getConnection(url, user, pass); 
//			Expired(int expiredId, Date insertDate, String supplier, String medicineName, int paking, String genericName,
//					String batchId, Date exDate, Date pursDate, String invoice, int returnQty, double purchaseRate,
//					String status, int purchasId)
			java.util.Date date = new java.util.Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String insertDate = dateFormat.format(date);
			Date d=Date.valueOf(insertDate);
			ps= con.prepareStatement("select s.supllier,s.medicineName,s.paking,s.genericName,s.batchId,s.ex_date,p.pursDate,p.invoice,s.qty,s.mrp,p.purchaseRate,p.purshasId from stock s join purshase p on s.batchId = p.batchId  where s.ex_date<curdate() and s.qty>0");
			
			rs=ps.executeQuery();
			while(rs.next()) {
				e.add(new Expired(0,d,rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getDate(6),rs.getDate(7),rs.getString(8),rs.getInt(9),rs.getDouble(11),"Expired",rs.getInt(12)));
			}
			System.out.println("saveExpired "+e);
			if(e!=null) {
				for(int i=0;i<e.size();i++) {
					ps=con.prepareStatement("insert into expired values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					ps.setInt(1, e.get(i).getExpiredId());
					ps.setDate(2, e.get(i).getInsertDate());
					ps.setString(3, e.get(i).getSupplier());
					ps.setString(4, e.get(i).getMedicineName());
					ps.setInt(5, e.get(i).getPaking());
					ps.setString(6, e.get(i).getGenericName());
					ps.setString(7, e.get(i).getBatchId());
					ps.setDate(8, e.get(i).getExDate());
					ps.setDate(9, e.get(i).getPursDate());
					ps.setString(10, e.get(i).getInvoice());
					ps.setInt(11, e.get(i).getReturnQty());
					ps.setDouble(12, e.get(i).getPurchaseRate());
					ps.setString(13, e.get(i).getStatus());
					ps.setInt(14, e.get(i).getPurchasId());
					ps.executeUpdate();
					ps=con.prepareStatement("update stock set qty=0 where batchId=?");
					ps.setString(1, e.get(i).getBatchId());
					ps.executeUpdate();
				}
			}
			
			ps=con.prepareStatement("select * from expired where status='Expired'");
			rs=ps.executeQuery();
			while(rs.next()) {
				expiredData.add(new Expired(rs.getInt(1),rs.getDate(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getDate(8),rs.getDate(9),rs.getString(10),rs.getInt(11),rs.getDouble(12),rs.getString(13),rs.getInt(14)));
			}
			con.close();
			
			System.out.println("saveExpired "+expiredData);
		}catch(Exception ex ) {
			System.out.println("saveExpired "+ex);
		}
		return expiredData;
	}
	
	
	//==============================update expired status==============
	
	public void updateExpiredStatus(List<Expired> ex) {

		try {
			con = DriverManager.getConnection(url, user, pass); 
			for(int i=0;i<ex.size();i++) {
			ps=con.prepareStatement("update expired set status='Expired Returend' where expiredId=?");
			ps.setInt(1, ex.get(i).getExpiredId());
			ps.executeUpdate();
			}
		}catch(Exception e ) {
			System.out.println("saveExpired update "+e);
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
