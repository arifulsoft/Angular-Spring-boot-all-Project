package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDA {

	// --------------------------------- User data registration part----------

	public User save(User s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/faisal", "root", "root");
			PreparedStatement ps = con.prepareStatement("INSERT INTO user VALUES(?,?,?,?,?,?,?)");

			ps.setInt(1, s.getA_number());
			ps.setString(2, s.getName());
			ps.setString(3, s.getGender());
			ps.setString(4, s.getEmail());
			ps.setString(5, s.getPassword());
			ps.setString(6, s.getPhone());
			ps.setDouble(7, s.getBalance());

			ps.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return s;
	}

	// ------------------------------ show all user data------------

//	List<User> slist = new ArrayList<>();
//
//	public List<User> show() {
//
//		try {
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/abcd", "root", "nclc123456");
//			PreparedStatement ps = con.prepareStatement("select * from user");
//			ResultSet rs = ps.executeQuery();
//			while (rs.next()) {
//				slist.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
//						rs.getString(6), rs.getDouble(7)));
//
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//		return slist;
//	}

//	------------------------------ search an user account ---------------

	public User search(int a_number) {
		User e = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/faisal", "root", "root");
			PreparedStatement ps = con.prepareStatement("select * from user where a_number=?");

			ps.setInt(1, a_number);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				e = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getDouble(7));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;
	}

//	--------------------------------- update user data ----------------------------

	public User update(User s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/faisal", "root", "root");
			PreparedStatement ps = con.prepareStatement(
					"update user set name=?, gender=?, email=?, password=?, phone=?, balance=? where a_number=?");

			ps.setString(1, s.getName());
			ps.setString(2, s.getGender());
			ps.setString(3, s.getEmail());
			ps.setString(4, s.getPassword());
			ps.setString(5, s.getPhone());
			ps.setDouble(6, s.getBalance());
			ps.setInt(7, s.getA_number());

			ps.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return s;
	}

//	--------------------------------- delete user data ----------------------------

	public void delete(int a_number) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/faisal", "root", "root");
			PreparedStatement ps = con.prepareStatement("delete from user where a_number=?");

			ps.setInt(1, a_number);

			ps.executeUpdate();
			con.close();
			System.out.println("deleted");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
