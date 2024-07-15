package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.BookRepository;

//@CrossOrigin(origins = "http://localhost:4200/") //angular
@CrossOrigin(origins = "*") //flutter 
@RestController
public class UserController {
	@Autowired
	private BookRepository repo;

	@GetMapping("/{id}")
	public User m3(@PathVariable int id) {
		UserDA da = new UserDA();
		User data = da.search(id);
		return data;
	}

//	------------------------ get book name -----------------------------
	List<Mystery> slist = new ArrayList<>();

	@GetMapping("/searchbybookname/{bname}")
	public List<Mystery> getbybookname(@PathVariable String bname) {
		AdminDA da = new AdminDA();
		slist = da.getbybookname(bname);
		return slist;
	}

//	--------------- get all related books by name from category table  ------------

	@GetMapping("/searchcategory/{name}")
	public List<Mystery> getallrelatedbooks(@PathVariable String name) {
		AdminDA da = new AdminDA();
		slist = da.getallrelatedbooks(name);
		return slist;
	}

//	---------------------------angular and flutter insert --------------------------------

	@PostMapping(value="/insert")
	public User dosave(@RequestBody User s) {
		UserDA da = new UserDA();
		User st = da.save(s);

		return st;
	}
	
//	------------------------------- update -------------------------------

	@PutMapping("/update")
	public User doupdate(@RequestBody User s) {
		UserDA da = new UserDA();
		User st = da.update(s);

		return st;
	}

//	--------------------------- insert new book --------------------------------

	@PostMapping("/insertnewbook")
	public Mystery dosave(@RequestBody Mystery b) {
		AdminDA ab = new AdminDA();
		Mystery st = ab.savebook(b);

		return st;
	}

//	---------------------------------show all user data------------------------

	List<User> x5 = new ArrayList<>();

	@GetMapping("/show")
	public List<User> getalluserdata1() {
		UserDA da = new UserDA();
		x5 = da.show();
		return x5;
	}

//	--------------------------------angular login part------------------------------
	@GetMapping("/{id}/{password}")
	public Admin m3(@PathVariable int id, @PathVariable String password) {
		AdminDA da = new AdminDA();
		Admin data = da.login(id, password);
		return data;
	}
	
	//----------------------flutter part-----------------------------
	@PostMapping(value="/loginadmin")
	public Admin signinadmin(@RequestBody Admin s) {
		AdminDA da = new AdminDA();
		Admin st = da.adminSignin(s.id, s.password);
		return st;
	}

//-----------------------------------show all category------------------------
	List<Category> x1 = new ArrayList<>();

	@GetMapping("/showcategory")
	public List<Category> getalluserdata() {
		AdminDA da = new AdminDA();
		x1 = da.showcategory();
		return x1;
	}

	// -------------------show all mystery books------------------------
	List<Mystery> x2 = new ArrayList<>();

	@GetMapping("/showmysterybooks")
	public List<Mystery> getallmysterydata() {
		AdminDA da = new AdminDA();
		x2 = da.showmysterybooks();
		return x2;
	}

//	--------------- get all book by number   ------------

	@GetMapping("/getbookbynumber/{bookNumber}")
	public Mystery getBookbyNumber(@PathVariable int bookNumber) {

		UserDA da = new UserDA();
		Mystery bookByNumber = da.getBookByNumber(bookNumber);

		return bookByNumber;
	}

	// -----------------------------------save Borrowed book list all
	// category------------------------

//		@GetMapping("/saveBorrowedBookList")
//		public List<Mystery> saveBorrowedList(List<Mystery> b) {
//			UserDA da = new UserDA();
//			System.out.println("helo shamim");
//			List<Mystery> saveBorrowedList2 = da.saveBorrowedList(b);
//			System.out.println("helo shamim");
//			return saveBorrowedList2;
//		}

//	@PostMapping("/saveborrowedBookList")
//	public void saveAllBorrowedBookList(@RequestBody  List<BorrowedBook> b){
//		System.out.println("hello");
//		UserDA userda = new UserDA();
//		System.out.println(b);
//		repo.saveAll(b);
//		System.out.println(b);
//	}
//	

//	@PostMapping("/insert")
//	public User dosave(@RequestBody User s) {
//		UserDA da = new UserDA();
//		User st = da.save(s);
//
//		return st;
//	}

	@GetMapping("/say")
	public String sayHello() {
		return "hello";
	}

//	------------------------------- update Mystery for borrowed books -------------------------------

	@PutMapping("/updatemystery")
	public void doupdate(@RequestBody List<Mystery> s) {
		AdminDA da = new AdminDA();
		
		da.update(s);

	}
//	------------------------------- update Mystery for return books -------------------------------

	@GetMapping("/updatemysterybooks/{s}")
	public void doupdatem(@PathVariable int s) {
//		System.out.println(s);
		AdminDA da = new AdminDA();
		
		
		da.returnMistry(s);

	}
	
//	----------------------------------new method---------------------------------------------
	
	@GetMapping(value= "/reports/{format}")
	public String exportReport(@PathVariable String format){
		String path="C:\\reports\\";
		String reportpath="";
		try {
			UserDA da = new UserDA();
			List<User> slist1 = da.show();

		} catch (Exception e) {
			// TODO: handle exception
		}
		return "";
	}
	
}
