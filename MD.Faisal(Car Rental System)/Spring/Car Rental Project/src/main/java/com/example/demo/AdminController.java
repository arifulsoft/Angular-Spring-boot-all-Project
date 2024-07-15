package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.LaunchProduct;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@CrossOrigin(origins="*")


public class AdminController {

//------------------------ admin login ---------------------------
	@GetMapping("/{id}/{password}")
	public Admin login(@PathVariable int id, @PathVariable String password) {
		AdminDA da = new AdminDA();
		Admin data = da.login(id, password);
		return data;
	}
//	------------------------ admin login //Flutter ----------
	
	@PostMapping(value="/adminlogin")
	public Admin signinStudent(@RequestBody Admin s) {
		AdminDA da = new AdminDA();
		Admin st=da.studentSigninById(s.id,s.password);
		return st;
	}
	
//	------------User Table Insert  --------------
//	
//	@PostMapping("/insert")
//	public User loginForAdmin(@RequestBody User s) {
//
//		UserDA da = new UserDA();
//		User data = da.save(s);
//
//		return data;
//	}

	
	
	

//	------------------ show all admin data ---------------------------

	List<Admin> x1 = new ArrayList<>();

	@GetMapping("/show_admin")
	public List<Admin> getAdminData() {

		AdminDA da = new AdminDA();
		x1 = da.show_admin();

		return x1;
	}

//	-------------------- user registration ----------------------------------------
	

	@PostMapping("/insert")
	public User doSave(@RequestBody User s) {

		UserDA da = new UserDA();
		User data = da.save(s);

		return data;
	}

//	------------------------show all user data ------------------------------

	List<User> slist = new ArrayList<>();

	@GetMapping("/show")
	public List<User> getShow() {
		System.out.println("controller");

		AdminDA da = new AdminDA();
		slist = da.showAllData();

		return slist;
	}

//	--------------------------- search an user account for update-------------------------------
	@GetMapping("/{a_number}")
	public User search(@PathVariable int a_number) {

		UserDA da = new UserDA();
		User data = da.search(a_number);
		return data;
	}

//	----------------- update user data -----------------------------------

	@PutMapping("/update")
	public User doUpdate(@RequestBody User s) {

		UserDA da = new UserDA();
		User data = da.update(s);

		return data;
	}
	
//---------- Delete user data ---------------
	public void doDelete(@PathVariable int a_number) {

		UserDA da = new UserDA();
		da.delete(a_number);

	}
//	-------- admin insert---------
	
	@PostMapping("/insert_admin")
	public Admin Save(@RequestBody Admin s) {

		AdminDA da = new AdminDA();
		Admin data = da.save(s);

		return data;
	}
	
	
	//------------------------ customer login ---------------------------
	List<Car_transaction_table> e = new ArrayList<>();
		@GetMapping("/login/{from}/{to}")
		public List<Car_transaction_table> login2(@PathVariable String from, @PathVariable String to) {
			CarDA da = new CarDA();
//			System.out.println("hello controller");
//			System.out.println(from);
//			System.out.println(to);
//			System.out.println(booking_date);
//			System.out.println(return_date);
			e = da.cstSearch(from, to);
			return e;
		}
//	---------Show all cars-------
		
		List<Car_table> Carlist = new ArrayList<>();

		@GetMapping("/show_cars")
		public List<Car_table> ShowCars() {
			System.out.println("controller");

			CarDA da = new CarDA();
			Carlist = da.showAllcars();

			return Carlist;
			
		}
//  ---------- Post Carbooking Table------
		@PostMapping("/cartransection")
		public void Carbooking(@RequestBody Carbooking s) {
			System.out.println("hello fnd");
			
			CarDA da = new CarDA();
			 da.Carbooking(s);

			
		}
// ------ Shpw car Booking Table-----
		List<Carbooking> bookingList = new ArrayList<>();

		@GetMapping("/showBookingTable")
		public List<Carbooking> Showbooking() {
			System.out.println("controller");

			CarDA da = new CarDA();
			bookingList = da.showBookingTable();

			return bookingList;
			
		}
		
//		--------- get Booking Table Data by Nid-------
		
		@GetMapping("/getByNid/{nid}")
		public Carbooking getDataByNid(@PathVariable int nid ) {
			CarDA da = new CarDA();
			Carbooking data = da.loginbyNid(nid);
			return data;
		}
		
		
		@PostMapping("/insertapproval") 
		public Booking_approval_table insertapproval(@RequestBody Booking_approval_table s) {
			CarDA da = new CarDA();
			Booking_approval_table data= da.insertapproval(s);
			return data;
			
		}
		
		
		//---------- Delete user data ---------------
		@DeleteMapping("/deletecarbooking/{nid}")
		public void delecarbooking(@PathVariable int nid) {

			CarDA da = new CarDA();
			da.deletecarbooking(nid);

		}

//	------- Search By Nid for payment------
		
		@GetMapping("/searchByNid/{nid}")
		public Booking_approval_table searchbynid(@PathVariable int nid) {
			CarDA da = new CarDA();
			Booking_approval_table data = da.searchbyNid(nid);
			return data;
		}
			
		
//		-------Show Booking Approval Table---
		
		List<Booking_approval_table> approvalList = new ArrayList<>();

		@GetMapping("/showApprovalTable")
		public List<Booking_approval_table> Showapproval() {
			System.out.println("controller");

			CarDA da = new CarDA();
			approvalList = da.showApprovalTable();

			return approvalList;
			
		}
		
}
