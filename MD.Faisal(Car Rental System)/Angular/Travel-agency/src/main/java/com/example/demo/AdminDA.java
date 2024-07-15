package com.example.demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDA {
	
//	-------------------- Admin login ----------------------
	
	public Admin login( int id,String password ) {
		Admin e = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/faisal", "root", "root");
			PreparedStatement ps = con.prepareStatement("select * from admin where id=? AND password=?");

			ps.setInt(1, id);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				e = new Admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;
	}
	
//	---------- Admin Login Flutter-------

//	public Admin loginFlutter(int id, String password) {
//		Admin s = new Admin();
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/faisal", "root", "root");
//			 PreparedStatement pst = con.prepareStatement("select * from admin where id=" + id+" and password='"+password+"'");
//			ResultSet rs = pst.executeQuery();
//			while (rs.next()) {
//				s = new Admin (rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),						rs.getString(6), rs.getString(7));
//			}
//			
//			con.close();
//		} catch (SQLException | ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		return s;
//	}
	
	
	
//	------------------------ show all admin info ---------------------
	
	List<Admin> slist = new ArrayList<>();

	public List<Admin> show_admin() {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/faisal", "root", "root");
			PreparedStatement ps = con.prepareStatement("select * from admin");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				slist.add(new Admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7)));

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return slist;
	}
//	------------show user info ---------
	public List<User> showAllData() {
		List<User> slist = new ArrayList<>();

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/faisal", "root", "root");
			
		
			
			PreparedStatement ps = con.prepareStatement("select * from user");
			ResultSet rs = ps.executeQuery();
			System.out.println("found");
			while (rs.next()) {
				System.out.println("found");
				slist.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getDouble(7)));

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return slist;
	}
//	--------admin registration---------
	public Admin save(Admin s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/faisal", "root", "root");
			PreparedStatement ps = con.prepareStatement("INSERT INTO admin VALUES(?,?,?,?,?,?,?)");

			ps.setInt(1, s.getId());
			ps.setString(2, s.getName());
			ps.setString(3, s.getGender());
			ps.setString(4, s.getEmail());
			ps.setString(5, s.getPassword());
			ps.setString(6, s.getPhone());
			ps.setString(7, s.getAddress());

			ps.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return s;
	}
	
	
	
//	--------admin registration---------

}
