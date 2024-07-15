package com.example.demo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HmsDa {

	// ----------------insert Register---------------------------

	public Register save(Register s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement pst = con
					.prepareStatement("INSERT INTO register(username,email,password,role) VALUES(?,?,?,?)");

			pst.setString(1, s.getUsername());
			pst.setString(2, s.getEmail());
			pst.setString(3, s.getPassword());
			pst.setString(4, s.getRole());

			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return s;
	}

	// ----------------insert appointment table---------------------------

	public Appointment alldatasave(Appointment s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement pst = con.prepareStatement("INSERT INTO appointment VALUES(?,?,?,?,?,?,?)");

			pst.setInt(1, s.getP_id());
			pst.setString(2, s.getP_name());
			pst.setString(3, s.getDep_name());
			pst.setString(4, s.getDoc_name());
			pst.setInt(5, s.getC_fee());
			pst.setString(6, s.getDate());
			pst.setString(7, s.getTime());

			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return s;
	}
	//=========================post into bill_sum table====================

	public BillSum insertIntoBillSum(BillSum s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement pst = con.prepareStatement("INSERT INTO bill_sum(p_id, p_name, phone, ad_date, dis_date, tnad, ad_amt, pdbc, tbc, doc_fee, m_bill, t_bill, total, discount, n_amt, paid, status) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			  
			pst.setString(1, s.getP_id());
			pst.setString(2, s.getP_name());
		    pst.setString(3,s.getPhone());
		    pst.setDate(4,s.getAd_date());
		    pst.setDate(5, s.getDis_date());
		    pst.setInt(6,s.getTnad());
		    pst.setDouble(7,s.getAd_amt());
		    pst.setDouble(8,s.getPdbc());
		    pst.setDouble(9,s.getTbc());
		    pst.setDouble(10,s.getDoc_fee());

		    pst.setDouble(11,s.getM_bill());
		    pst.setDouble(12,s.getT_bill());
		    pst.setDouble(13,s.getTotal());
		    pst.setDouble(14, s.getDiscount());
		    pst.setDouble(15, s.getN_amt());
		    pst.setDouble(16, s.getPaid());
		    pst.setString(17, "Paid");
		    
		  

			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return s;
	}

	// ----------------insert patient apply --------------------------

	public Patientapply patientapply(Patientapply s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement pst = con.prepareStatement("INSERT INTO patientapply VALUES(?,?,?,?,?,?)");

			pst.setInt(1, s.getNid());
			pst.setString(2, s.getName());
			pst.setString(3, s.getAge());
			pst.setString(4, s.getAddress());
			pst.setString(5, s.getPhone());
			pst.setString(6, s.getProblem());

			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return s;
	}

	// ----------------insert into prescription table --------------------------

	public Prescription addprescription(Prescription s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement pst = con.prepareStatement("INSERT INTO prescription VALUES(?,?,?,?,?,?,?,?)");

			pst.setInt(1, s.getP_id());
			pst.setString(2, s.getP_name());
			pst.setString(3, s.getAge());
			pst.setString(4, s.getD_name());
			pst.setString(5, s.getProblem());
			pst.setString(6, s.getPrescription());
			pst.setString(7, s.getAdvice());
			pst.setString(8, s.getDep_name());

			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return s;
	}

	// ----------------insert patient apply --------------------------

	public Admissiontable addpatientadmission(Admissiontable s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement pst = con.prepareStatement("INSERT INTO admissiontable VALUES(?,?,?,?,?,?,?,?,?,?)");

			pst.setInt(1, s.getP_id());
			pst.setString(2, s.getP_name());
			pst.setString(3, s.getDep_name());
			pst.setString(4, s.getD_id());
			pst.setString(5, s.getD_name());
			pst.setInt(6, s.getNid());
			pst.setString(7, s.getAge());
			pst.setString(8, s.getAddress());
			pst.setString(9, s.getPhone());
			pst.setString(10, s.getProblem());

			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return s;
	}

	// ----------------------login method--------------------

	public Register search(String username, String password) {
		Register e = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement ps = con.prepareStatement("select * from register where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				e = new Register(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;
	}

	// ----------------------search a single patient info--------------------

	public Patientapply getpatientinfo(int nid) {
		Patientapply e = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement ps = con.prepareStatement("select * from patientapply where nid=?");
			ps.setInt(1, nid);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				e = new Patientapply(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;
	}

	// ----------------------search a single patient
	// prescription--------------------p_id

	public Prescription getPrescription(int p_id) {
		Prescription e = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement ps = con.prepareStatement("select * from prescription where p_id=?");
			ps.setInt(1, p_id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				e = new Prescription(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;
	}

	// ----------------------search a patient appointment status
	// ---------myself-----------

	public Appointment getAppStatus(int p_id) {
		Appointment e = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement ps = con.prepareStatement("select * from appointment where p_id=?");
			ps.setInt(1, p_id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				e = new Appointment(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
						rs.getString(6), rs.getString(7));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;
	}

	// ----------------------search a patient appointment status
	// ---------myself-----------

	public Admissiontable getpatienttreat(int p_id) {
		Admissiontable e = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement ps = con.prepareStatement("select * from admissiontable where p_id=?");
			ps.setInt(1, p_id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				e = new Admissiontable(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;
	}

	// ---------------------show all patient by doctor id--------------------

	public List<Admissiontable> getalladmissionpatient(String d_id) {
		List<Admissiontable> slist = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement ps = con.prepareStatement("select * from admissiontable where d_id=?");
			ps.setString(1, d_id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				slist.add(new Admissiontable(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9),
						rs.getString(10)));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return slist;
	}

	// ----------------------show department table data--------------------

	public List<Department> showAll() {
		List<Department> slist = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement ps = con.prepareStatement("select * from department");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				slist.add(new Department(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return slist;
	}
//	--------------------- show all patient data ------------------------

	public List<Patientapply> showAllpatient() {
		List<Patientapply> slist = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement ps = con.prepareStatement("select * from patientapply");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				slist.add(new Patientapply(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6)));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return slist;
	}

//	--------------------- show all admitted patient ------------------------

	public List<Admissiontable> getadmittedpatient() {
		List<Admissiontable> slist = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement ps = con.prepareStatement("select * from admissiontable");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				slist.add(new Admissiontable(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9),
						rs.getString(10)));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return slist;
	}

	// ----------------------show all doctors name--------------------

	public List<Doctor> getalldoctor(int dep_id) {
		List<Doctor> slist = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement ps = con.prepareStatement("select * from doctor where dep_id=?");
			ps.setInt(1, dep_id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				slist.add(new Doctor(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getInt(10),
						rs.getString(11), rs.getInt(12), rs.getString(13)));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return slist;
	}

	// -------------------------search all patients by doctor
	// name-----------------------

	public List<Appointment> getallpatient(String doc_name) {

		List<Appointment> slist = new ArrayList<>();

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement ps = con.prepareStatement("select * from appointment where doc_name=?");
			ps.setString(1, doc_name);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				slist.add(new Appointment(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
						rs.getString(6), rs.getString(7)));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return slist;
	}

	// ------------------delete patient----------------------------------

	public Appointment deletePatient(int p_id) {
		Appointment e = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement pst = con.prepareStatement("delete from  appointment where p_id=?");
			pst.setInt(1, p_id);

			pst.executeUpdate();
			con.close();

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;

	}

	// ------------------discharge patient----------------------------------

	public Admissiontable dischargepatient(int p_id) {
		Admissiontable e = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement pst = con.prepareStatement("delete from  admissiontable where p_id=?");
			pst.setInt(1, p_id);

			pst.executeUpdate();
			con.close();

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;

	}

	// ------------------delete application
	// patient----------------------------------

	public Patientapply deletePatientapply(int nid) {
		Patientapply e = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement pst = con.prepareStatement("delete from  patientapply where nid=?");
			pst.setInt(1, nid);

			pst.executeUpdate();
			con.close();

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;

	}

//		.....................Update data in database................

//		public Bank update(Bank s) {
//
//			try {
//				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "sumon123");
//				PreparedStatement pst1 = con
//						.prepareStatement("update registration set username=? email=?,password=?,role=? where user_id=?");
//
//				System.out.println(pst1);
//
//				pst1.setString(1, s.getUsername());
//				pst1.setString(2, s.getEmail());
//				pst1.setString(3, s.getPassword());
//				pst1.setString(4, s.getRole());
//				pst1.setInt(5, s.getUser_id());
//				
//
//				pst1.executeUpdate();
//				System.out.println("update");
//				con.close();
//
//			} catch (Exception ex) {
//				// TODO: handle exception
//			}
//
//			return s;
//		}

//	--------------------- Bill ------------------------

	public void billAddOnAdmission(int p_id, Date d) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement pst = con.prepareStatement("INSERT INTO bill(p_id, ad_date, t_charge) VALUES(?,?,?)");
			pst.setInt(1, p_id);
			pst.setDate(2, d);
			pst.setDouble(3, 0);
			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

	public void billPay(Bill b) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement pst = con.prepareStatement(
					"INSERT INTO bill(p_id, ad_date, t_charge, paid, due, status, dischargeDate) VALUES(?,?,?,?,?,?,?)");
			pst.setInt(1, b.getP_id());
			pst.setDate(2, b.getAd_date());
			pst.setDouble(3, b.getT_charge());
			pst.setDouble(4, b.getPaid());
			pst.setDouble(5, b.getDue());
			pst.setString(6, b.getStatus());
			pst.setDate(7, b.getDischargeDate());
			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

//--------------------- Payment ------------------------
	public Payment paymentAdd(Payment p) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement pst = con.prepareStatement(
					"INSERT INTO payment(p_id, p_name, d_id, age, phone, c_fee, pdbc, tbc, m_bill, t_charge, vat, t_amt, discount, n_amt, date, admissionCharge) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

			pst.setInt(1, p.getP_id());
			pst.setString(2, p.getP_name());
			pst.setString(3, p.getD_id());
			pst.setString(4, p.getAge());
			pst.setString(5, p.getPhone());
			pst.setDouble(6, 0);
			pst.setDouble(7, 500);
			pst.setDouble(8, 0);
			pst.setDouble(9, 0);
			pst.setDouble(10, 0);
			pst.setDouble(11, 0);
			pst.setDouble(12, 0);
			pst.setDouble(13, 0);
			pst.setDouble(14, 0);
			pst.setDate(15, p.getDate());
			pst.setDouble(16, p.getAdmissionCharge());

			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		return p;
	}

	public void addPaymentOnAdmission(Payment p) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement pst = con.prepareStatement(
					"INSERT INTO payment(p_id, p_name, d_id, age, phone, c_fee, pdbc, tbc, m_bill, t_charge, vat, t_amt, discount, n_amt, date, admissionCharge) VALUES(?,?,?,?,?,?,?)");
			pst.setInt(1, p.getP_id());
			pst.setString(2, p.getP_name());
			pst.setString(3, p.getD_id());
			pst.setString(4, p.getAge());
			pst.setString(5, p.getPhone());
			pst.setDate(6, p.getDate());
			pst.setDouble(7, p.getAdmissionCharge());

			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

//--------------------update bill record-----------
	Payment data;

	public void updateConsultationFee(double amount, int p_id) {
		data = null;
		System.out.println(amount);
		System.out.println(p_id);
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement pst1 = con.prepareStatement("select * from payment where p_id=?");
			pst1.setInt(1, p_id);
			ResultSet rs = pst1.executeQuery();

			while (rs.next()) {
				data = new Payment(rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
						rs.getDouble(7), rs.getDouble(8), rs.getDouble(9), rs.getDouble(10), rs.getDouble(11),
						rs.getDouble(12), rs.getDouble(13), rs.getDouble(14), rs.getDouble(15), rs.getDate(16),
						rs.getDouble(17));
			}
			System.out.println("Result Set =>" + data.getP_id());
			double total = data.getT_charge() + amount;
			double vat = total * 15 / 100;
			double t_amt = total + vat;
			double discount = total * 10 / 100;
			double n_amt = t_amt - discount;
//		System.out.println("t_charge  =>"+t_charge);
			System.out.println("vat  =>" + vat);
			System.out.println("t_amt  =>" + t_amt);
			System.out.println("discount  =>" + discount);
			System.out.println("n_amt  =>" + n_amt);

			PreparedStatement pst = con
					.prepareStatement("update payment set c_fee=?, vat=?, t_amt=?, discount=?, n_amt=? where p_id=?");

			pst.setDouble(1, amount);
//		pst.setDouble(2,t_charge);
			pst.setDouble(2, vat);
			pst.setDouble(3, t_amt);
			pst.setDouble(4, discount);
			pst.setDouble(5, n_amt);
			pst.setInt(6, p_id);

			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

//--------------------update bill record-----------

	public void updateMedicineBill(double amount, int p_id) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement pst1 = con.prepareStatement("select * from payment where p_id=?");
			pst1.setInt(1, p_id);
			ResultSet rs = pst1.executeQuery();

			while (rs.next()) {
				data = new Payment(rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
						rs.getDouble(7), rs.getDouble(8), rs.getDouble(9), rs.getDouble(10), rs.getDouble(11),
						rs.getDouble(12), rs.getDouble(13), rs.getDouble(14), rs.getDouble(15), rs.getDate(16),
						rs.getDouble(17));
			}
			System.out.println("Result Set =>" + data.getP_id());
			double total = data.getT_charge() + amount;
			double vat = total * 15 / 100;
			double t_amt = total + vat;
			double discount = total * 10 / 100;
			double n_amt = t_amt - discount;
//		System.out.println("t_charge  =>"+t_charge);
			System.out.println("vat  =>" + vat);
			System.out.println("t_amt  =>" + t_amt);
			System.out.println("discount  =>" + discount);
			System.out.println("n_amt  =>" + n_amt);

			PreparedStatement pst = con
					.prepareStatement("update payment set m_bill=?, vat=?, t_amt=?, discount=?, n_amt=? where p_id=?");

			pst.setDouble(1, amount);
//		pst.setDouble(2,t_charge);
			pst.setDouble(2, vat);
			pst.setDouble(3, t_amt);
			pst.setDouble(4, discount);
			pst.setDouble(5, n_amt);
			pst.setInt(6, p_id);

			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

//--------------------update bill record-----------

	public void updateTestChargeBill(double amount, int p_id) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement pst1 = con.prepareStatement("select * from payment where p_id=?");
			pst1.setInt(1, p_id);
			ResultSet rs = pst1.executeQuery();

			while (rs.next()) {
				data = new Payment(rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
						rs.getDouble(7), rs.getDouble(8), rs.getDouble(9), rs.getDouble(10), rs.getDouble(11),
						rs.getDouble(12), rs.getDouble(13), rs.getDouble(14), rs.getDouble(15), rs.getDate(16),
						rs.getDouble(17));
			}
			System.out.println("Result Set =>" + data.getP_id());
			double total = data.getT_charge() + amount;
			double vat = total * 15 / 100;
			double t_amt = total + vat;
			double discount = total * 10 / 100;
			double n_amt = t_amt - discount;
//		System.out.println("t_charge  =>"+t_charge);
			System.out.println("vat  =>" + vat);
			System.out.println("t_amt  =>" + t_amt);
			System.out.println("discount  =>" + discount);
			System.out.println("n_amt  =>" + n_amt);

			PreparedStatement pst = con.prepareStatement(
					"update payment set t_charge=?, vat=?, t_amt=?, discount=?, n_amt=? where p_id=?");

			pst.setDouble(1, amount);
//		pst.setDouble(2,t_charge);
			pst.setDouble(2, vat);
			pst.setDouble(3, t_amt);
			pst.setDouble(4, discount);
			pst.setDouble(5, n_amt);
			pst.setInt(6, p_id);

			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

//--------------------- Payment Des------------------------
	public PaymentDes paymentDesAdd(PaymentDes p) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement pst = con.prepareStatement("INSERT INTO paymentDes( p_id, p_date, amount) VALUES(?,?,?)");

			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return p;
	}

//===============================get patient id by nid=============================

	Admissiontable paitent;

	public Admissiontable getpatientId(int nid) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement pst = con.prepareStatement("select * from admissiontable where nid=?");

			pst.setInt(1, nid);

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				paitent = new Admissiontable(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9),
						rs.getString(10));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return paitent;

	}

//================================get patent details from==========================

	Payment allpaitentData;

	public Payment getAllPaymentPatientData(int pId) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement pst = con.prepareStatement("select * from payment where p_id=?");

			pst.setInt(1, pId);

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				allpaitentData = new Payment(rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getDouble(7), rs.getDouble(8), rs.getDouble(9), rs.getDouble(10),
						rs.getDouble(11), rs.getDouble(12), rs.getDouble(13), rs.getDouble(14), rs.getDouble(15),
						rs.getDate(16), rs.getDouble(17));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return allpaitentData;
	}

//====================================get all records from payment===================

	public List<Payment> getadmittedpatient(Date dateFrom, Date dateTo) {

		List<Payment> slist = new ArrayList<>();

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "sumon123");
			PreparedStatement ps = con
					.prepareStatement("select * from payment where date between  dateFrom  and dateTo");

//ps.setDate(1, dateFrom);
//ps.setDate(2, dateTo);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				slist.add(new Payment(rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
						rs.getDouble(7), rs.getDouble(8), rs.getDouble(9), rs.getDouble(10), rs.getDouble(11),
						rs.getDouble(12), rs.getDouble(13), rs.getDouble(14), rs.getDouble(15), rs.getDate(16),
						rs.getDouble(17)));
			}

		} catch (Exception ex) {
// TODO: handle exception
		}

		return slist;

	}

}
