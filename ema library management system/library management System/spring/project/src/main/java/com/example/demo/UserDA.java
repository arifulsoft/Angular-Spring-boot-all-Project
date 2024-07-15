package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class UserDA {

	public User search(int id) {
		User e =null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/system", "root", "nclc123456");
			PreparedStatement pst2 = con.prepareStatement("select * from User where id=?");
			pst2.setInt(1, id);
			ResultSet rs = pst2.executeQuery();
			while (rs.next()) {
				e=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;
	}
	
//	------------------------------ insert -----------------------------------
	public User save(User s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/system", "root", "nclc123456");
			PreparedStatement pst = con.prepareStatement("INSERT INTO User VALUES(?,?,?,?,?,?,?,?)");
			pst.setInt(1, s.getId());
			pst.setString(2, s.getName());
			pst.setString(3, s.getEmail());
			pst.setString(4, s.getAddress());
			pst.setString(5, s.getPhone());
			pst.setString(6, s.getPassword());
			pst.setString(7, s.getGender());
			pst.setString(8, s.getBorrowedbook());
			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return s;
	}
	
//------------------------ update --------------------------------------------
	public User update(User s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/system", "root", "nclc123456");
			PreparedStatement pst = con.prepareStatement("UPDATE  User SET  name=?, email=?, address=?,phone=?,password=?,gender=?,borrowedbook=? WHERE id=?");
			
			pst.setString(1, s.getName());
			pst.setString(2, s.getEmail());
			pst.setString(3, s.getAddress());
			pst.setString(4, s.getPhone());
			pst.setString(5, s.getPassword());
			pst.setString(6, s.getGender());
			pst.setString(7, s.getBorrowedbook());
			pst.setInt(8, s.getId());
			
			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return s;
	}

//-----------------------show all user data--------------------
	
	
	
	public List<User> show() {
		List<User> slist1 = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/system", "root", "nclc123456");
			PreparedStatement pst = con.prepareStatement("select * from user");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				slist1.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8)));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return slist1;
	}
	
//--------------------------get book by id----------------------------------
	
	public Mystery getBookByNumber(int id) {
		Mystery e =null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/system", "root", "nclc123456");
			PreparedStatement pst2 = con.prepareStatement("select * from mystery where number=?");
			pst2.setInt(1, id);
			ResultSet rs = pst2.executeQuery();
			
			while (rs.next()) {
				e=new Mystery(rs.getInt(1) ,rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;
	}
	
	
	
	//-----------------------save all borrowed book list to database-------------------
	
	
	
		public void saveBorrowedList(Mystery b) {
			List<Mystery> slist = new ArrayList<>();
			try {
				
				System.out.println("helo shamim");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/system", "root", "nclc123456");
				PreparedStatement pst = con.prepareStatement("insert into mystery (number, name, writer, image, categoryid, categoryname, bookshelf) values(?,?,?,?,?,?,?) ");
			   
//				for(Mystery s:b) {
					pst.setInt(1,b.getNumber());
					pst.setString(2, b.getName());
					pst.setString(3, b.getWriter());
					pst.setString(4, b.getImage());
					pst.setString(5, b.getStock());
					pst.setString(6, b.getCategoryname());
					pst.setString(7, b.getBookshelf());
					
					pst.executeUpdate();
					
//				}
				
				System.out.println("succeessfully add list");
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		
	
	
	
}
