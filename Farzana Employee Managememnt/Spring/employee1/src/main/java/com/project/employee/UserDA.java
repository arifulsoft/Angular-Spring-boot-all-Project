package com.project.employee;

import java.sql.*;

public class UserDA extends MySqlConnection {

	String searchUser="select * from user where userName=? and password=?";
	
	User loguser;
	public User loginUser(String usarName, String password) {
		try {
			con=DriverManager.getConnection(url, user, pass);
			ps=con.prepareStatement(searchUser);
			ps.setString(1, usarName);
			ps.setString(2, password);
			rs=ps.executeQuery();
			while(rs.next()) {
				loguser=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return loguser;
	}
	
//	-------------------------------------- flutter ----------------
	
	public User adminsignin(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, pass);
			ps=con.prepareStatement("select * from user where userId="+id);
			rs=ps.executeQuery();
			while(rs.next()) {
				loguser=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			}
			con.close();
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return loguser;
	}
	
}

//-------------------------- 
