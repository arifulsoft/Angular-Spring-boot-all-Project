package com.project.employee;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.*;

public class EmployeeDA extends MySqlConnection{
	
	String allemployees="select * from employees";
	String addEmployeeStatement="insert into employees(name,email,phoneNo,departmentId,roleId,dateOfJoining,salary,address) values(?,?,?,?,?,?,?,?)";
	
	public List<Employees> employees=new ArrayList<>();
	public List<Employees> allemployees(){
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(allemployees);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				employees.add(new Employees(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getDate(7),rs.getDouble(8),rs.getString(9),rs.getString(10)));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return employees;
	}
	
//	------------------------- flutter // show all emp --------------
	
	public List<Employees> viewallemployee() {
		List<Employees> stlist = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection	con = DriverManager.getConnection(url,user,pass);
		PreparedStatement	ps = con.prepareStatement("select * from employees");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				stlist.add(new Employees(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getDate(7),rs.getDouble(8),rs.getString(9),rs.getString(10)));
			}
			
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return stlist;
	}
	
//	------------------------------- 
	

public List<Transaction> showalltransaction() {
		List<Transaction> slist = new ArrayList<>();
		try {
		
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/abcd", "root", "nclc123456");
			Connection con = DriverManager.getConnection(url,user,pass);
			PreparedStatement ps = con.prepareStatement("select * from transaction");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				slist.add(new Transaction(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4),
						rs.getDouble(5), rs.getDouble(6), rs.getDouble(7), rs.getDate(8), rs.getString(9),
						rs.getDouble(10)));

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return slist;
	}
//  -------------------

public List<Employees2> getemploylist() {
	List<Employees2> slist = new ArrayList<>();
	try {
	
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/abcd", "root", "nclc123456");
		Connection con = DriverManager.getConnection(url,user,pass);
		PreparedStatement ps = con.prepareStatement("select * from employees");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			slist.add(new Employees2(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getDate(7),rs.getDouble(8),rs.getString(9),rs.getString(10)));
		}

	} catch (Exception e) {
		// TODO: handle exception
	}

	return slist;
}
	
	//____________________________Add Employee______________________________________
	//(name,email,phoneNo,departmentId,roleId,dateOfJoining,salary,address)
	public void addEmployee(Employees emp) {
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(addEmployeeStatement);
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getEmail());
			ps.setString(3, emp.getPhoneNo());
			ps.setInt(4, emp.getDepartmentId());
			ps.setInt(5, emp.getRoleId());
			ps.setDate(6, emp.getDateOfJoining());
			ps.setDouble(7, emp.getSalary());
			ps.setString(8, emp.getAddress());
			ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	
}
