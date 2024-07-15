package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDA {
//	----------------------angular part-----------------------
	public Admin login(int id, String password) {
		Admin e = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/system", "root", "nclc123456");
			PreparedStatement pst1 = con.prepareStatement("select * from admin where id=? AND password=?");
			pst1.setInt(1, id);
			pst1.setString(2, password);
			ResultSet rs = pst1.executeQuery();
			while (rs.next()) {
				e = new Admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;
	}
	
	//-------------------------flutter part----------------------------------
	public Admin adminSignin(int id, String password) {
		Admin s = new Admin();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/system", "root", "nclc123456");
			PreparedStatement pstmt = con.prepareStatement("select * from admin where id="+id+" AND password='"+password+"'");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				s =new Admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7));
			}
			
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return s;
	}

//	------------------------------ get book by name ------------------------------- 

	public List<Mystery> getbybookname(String bname) {
		List<Mystery> slist1 = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/system", "root", "nclc123456");
			PreparedStatement pst1 = con.prepareStatement("select * from mystery where name=?");

			pst1.setString(1, bname);
			ResultSet rs = pst1.executeQuery();
			while (rs.next()) {
				slist1.add(new Mystery(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6),rs.getString(7)));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return slist1;
	}

//	------------------------------ get all related  books by name ------------------------------- 

	public List<Mystery> getallrelatedbooks(String name) {
		List<Mystery> books = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/system", "root", "nclc123456");
			PreparedStatement pst1 = con.prepareStatement("select * from categorie where name=?");

			pst1.setString(1, name);
			ResultSet rs1 = pst1.executeQuery();
			
			PreparedStatement pst;
			ResultSet rs = null;

			if (rs1.next()) {
				pst = con.prepareStatement("select * from mystery where categoryname=?");
				pst.setString(1, name);
				rs = pst.executeQuery();

				while (rs.next()) {
					books.add(new Mystery(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5), rs.getString(6),rs.getString(7)));
				}
			} else {
				books.clear();

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return books;
	}

	// -----------------------show all Category data--------------------

	public List<Category> showcategory() {
		List<Category> slist = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/system", "root", "nclc123456");
			PreparedStatement pst = con.prepareStatement("select * from categorie");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				slist.add(new Category(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return slist;
	}

	// -----------------------show all mystery books data--------------------

	public List<Mystery> showmysterybooks() {
		List<Mystery> slist = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/system", "root", "nclc123456");
			PreparedStatement pst = con.prepareStatement("select * from mystery");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				slist.add(new Mystery(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6),rs.getString(7)));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return slist;
	}
	
	
	
//	------------------------------ insert new book-----------------------------------
	
	public Mystery savebook(Mystery s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/system", "root", "nclc123456");
			PreparedStatement pst = con.prepareStatement("INSERT INTO Mystery VALUES(?,?,?,?,?,?,?)");
			pst.setInt(1, s.getNumber());
			pst.setString(2, s.getName());
			pst.setString(3, s.getWriter());
			pst.setString(4, s.getImage());
			pst.setString(5, s.getStock());
			pst.setString(6, s.getCategoryname());
			pst.setString(7, s.getBookshelf());
			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return s;
	}
	
	
//	------------------------------ borrowed books process ------------------------------- 
	public void update(List<Mystery> s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/system", "root", "nclc123456");
			PreparedStatement pst = con.prepareStatement("UPDATE  Mystery SET stock=stock-1 WHERE number=?");

			for(Mystery m: s) {				
				pst.setInt(1, m.getNumber());
				pst.executeUpdate();

				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	
	}
	
//	------------------------------ return books process ------------------------------- 
	public void returnMistry(int s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/system", "root", "nclc123456");
			PreparedStatement pst = con.prepareStatement("UPDATE  Mystery SET stock=stock+1 WHERE number=?");	
				pst.setInt(1, s);
				pst.executeUpdate();
//				System.out.println("updated");
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	
	}
	
	

}
