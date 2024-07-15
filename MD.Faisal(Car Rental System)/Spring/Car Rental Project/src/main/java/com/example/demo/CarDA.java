package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CarDA {

//	-------------------- Customer login ----------------------

	public List<Car_transaction_table> cstSearch(String from, String to) {
		List<Car_transaction_table> e = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/faisal", "root", "root");
			PreparedStatement ps = con.prepareStatement("select * from car_transaction_table where from=? AND to=?");

//			serial_no, car_name, car_number, from, to, booking_date, return_date, total_rent
//			System.out.println(from);
//			System.out.println(to);
//			System.out.println(booking_date);
//			System.out.println(return_date);

			ps.setString(1, from);
			ps.setString(2, to);
//			ps.setString(3, booking_date);
//			ps.setString(4, return_date);
//			boolean execute = ps.execute();
//			System.out.println(execute);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				e.add(new Car_transaction_table(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getDate(6), rs.getDate(7), rs.getDouble(8), rs.getString(9), rs.getInt(10),
						rs.getInt(11), rs.getInt(12), rs.getDouble(13)));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;
	}

//	----------Show all cars------

	public List<Car_table> showAllcars() {
		List<Car_table> slist = new ArrayList<>();

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/faisal", "root", "root");

			PreparedStatement ps = con.prepareStatement("select * from car_table");
			ResultSet rs = ps.executeQuery();
			System.out.println("found");
			while (rs.next()) {
				System.out.println("found");
				slist.add(new Car_table(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
						rs.getString(6), rs.getDouble(7), rs.getInt(8), rs.getLong(9)));

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return slist;
	}

	public Car_table carbyid(int id) {
//		List<Car_table> slist = new ArrayList<>();
		Car_table car = new Car_table();

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/faisal", "root", "root");

			PreparedStatement ps = con.prepareStatement("select * from car_table where serial_no=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			System.out.println("found");
			while (rs.next()) {
				System.out.println("found");
				car = new Car_table(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
						rs.getString(6), rs.getDouble(7), rs.getInt(8), rs.getLong(9));

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		return car;
	}

//	------- save to car transaction table--------
	int serial;

	public void carTransaction(Car_transaction_table s) {
		System.out.println("Querry");

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/faisal", "root", "root");
//			for(int i=0;i<s.size();i++) {
			serial = 0;
//				PreparedStatement ps = con.prepareStatement("INSERT INTO car_transaction_table( serial_no,car_name, car_number, from, to,  total_rent, customer_name, customer_nid, customer_mobile_no, total_days, advance_payment) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
//				PreparedStatement ps1 = con.prepareStatement("select * from car_transaction_table");
//				ResultSet rs=ps1.executeQuery();
//				while(rs.next()) {
//					serial=rs.getInt(1)+1;
//				}
//				System.out.println(serial);
//				
//			
//				
//				ps.setInt(1, serial+1);
//				ps.setString(2, s.getCar_name());
//				ps.setString(3, s.getCar_number());
//				ps.setString(4, s.getFrom());
//				ps.setString(5, s.getTo());
//				ps.setDate(6, s.getBooking_date());
//				ps.setDate(7, s.getReturn_date());
//				ps.setDouble(8, s.getTotal_rent());
//				ps.setString(9, s.getCustomer_name());
//				ps.setInt(10, s.getCustomer_nid());
//				ps.setInt(11, s.getCustomer_mobile_no());
//				ps.setInt(12, s.getTotal_days());
//				ps.setDouble(13, s.getAdvance_payment());

			PreparedStatement ps = con.prepareStatement("INSERT INTO car_transaction_table( car_name) VALUES(?)");
//				ps.setInt(1, 1);
			ps.setString(1, "Toyota");
			ps.executeUpdate();
//			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

//-----------save to car Booking Table--------

	public Carbooking Carbooking(Carbooking s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/faisal", "root", "root");
			PreparedStatement ps = con
					.prepareStatement("INSERT INTO carbooking VALUES(?,?,?,?,?,?,?,?,?,?,?,NOW(),NOW(),?,?)");

			ps.setInt(1, s.getNid());
			ps.setString(2, s.getName());
			ps.setString(3, s.getM_number());
			ps.setString(4, s.getFrom());
			ps.setString(5, s.getTo());
			ps.setString(6, s.getCar_name());
			ps.setString(7, s.getCar_number());
			ps.setInt(8, s.getCar_seating());
			ps.setInt(9, s.getRent_per_day());
			ps.setInt(10, s.getTotal_day());
			ps.setInt(11, s.getAmount());
			ps.setInt(12, s.getAdvance_payment());
			ps.setInt(13, s.getDue());

			System.out.println(s);
			ps.executeUpdate();
			System.out.println(s);

		} catch (Exception e) {
			// TODO: handle exception
		}

		return s;
	}

//	------- show car booking table------

	public List<Carbooking> showBookingTable() {
		List<Carbooking> slist = new ArrayList<>();

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/faisal", "root", "root");

			PreparedStatement ps = con.prepareStatement("select * from carbooking");
			ResultSet rs = ps.executeQuery();
			System.out.println("found");
			while (rs.next()) {
				System.out.println("Show booking Transaction");
				slist.add(new Carbooking(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getInt(10),
						rs.getInt(11), rs.getDate(12), rs.getDate(13), rs.getInt(14), rs.getInt(15)));

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return slist;
	}

//	--------- Get data by Nid------
	public Carbooking loginbyNid(int nid) {
		Carbooking e = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/faisal", "root", "root");
			PreparedStatement ps = con.prepareStatement("select * from carbooking where nid=? ");

			ps.setInt(1, nid);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				e = new Carbooking(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11),
						rs.getDate(12), rs.getDate(13), rs.getInt(14), rs.getInt(15));

			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;
	}

	public Booking_approval_table insertapproval(Booking_approval_table s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/faisal", "root", "root");
			PreparedStatement ps = con
					.prepareStatement("INSERT INTO booking_approval_table VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
			// nid, name, mobile_number, from, to, car_number, booking_date, total_day,
			// total_rent, due_rent, status
			ps.setInt(1, s.getNid());
			ps.setString(2, s.getName());
			ps.setString(3, s.getMobile_number());
			ps.setString(4, s.getFrom());
			ps.setString(5, s.getTo());
			ps.setString(6, s.getCar_number());
			ps.setDate(7, s.getBooking_date());
			ps.setInt(8, s.getTotal_day());
			ps.setInt(9, s.getTotal_rent());
			ps.setInt(10, s.getDue_rent());
			ps.setInt(11, s.getAdvance_payment());
			ps.setString(12, "pending");

			ps.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return s;

	}

	public void deletecarbooking(int nid) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/faisal", "root", "root");
			PreparedStatement ps = con.prepareStatement("delete from carbooking where nid=?");

			ps.setInt(1, nid);

			ps.executeUpdate();
			con.close();
			System.out.println("deleted");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

//	------- search by Nid for payment---------------------
	public Booking_approval_table searchbyNid(int nid) {
		Booking_approval_table e = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/faisal", "root", "root");
			PreparedStatement ps = con.prepareStatement("select * from booking_approval_table where nid=? ");

			ps.setInt(1, nid);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				
				e=new Booking_approval_table(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getDate(7), rs.getInt(8), rs.getInt(9), rs.getInt(10),
						rs.getInt(11), rs.getString(12));

			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;
	}

//	--------- show Booking Approval Table-------

	public List<Booking_approval_table> showApprovalTable() {

		List<Booking_approval_table> slist = new ArrayList<>();

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/faisal", "root", "root");
			PreparedStatement ps = con.prepareStatement("select * from booking_approval_table");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				slist.add(new Booking_approval_table(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getDate(7), rs.getInt(8), rs.getInt(9), rs.getInt(10),
						rs.getInt(11), rs.getString(12)));

			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return slist;
	}

}
