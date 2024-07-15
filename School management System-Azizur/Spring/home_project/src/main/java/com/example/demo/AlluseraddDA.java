package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AlluseraddDA {
	public Alluser save(Alluser s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/idb_project", "root", "nclc123456");
			PreparedStatement pst = con.prepareStatement("INSERT INTO alluser VALUES(?,?,?,?,?,?)");
			pst.setString(1, s.getUsername());
			pst.setString(2, s.getname());
			pst.setString(3, s.getemail());
			pst.setString(4, s.getpassword());
			pst.setString(5, s.getImage());
			pst.setString(6, s.getRole());
			
			
			
			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return s;
	}
	
	
	
}


