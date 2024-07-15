package com.example.demo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.AppRepo;
import com.example.demo.Repository.DepartmentRepo;
import com.example.demo.Repository.RegisterRepo;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class HmsController {

	@Autowired
	private RegisterRepo regsRepo;
	@Autowired
	private AppRepo appRepo;
	@Autowired
	private DepartmentRepo departmentRepo;

	// --------------------------------------------insert------------------------------

	@PostMapping("/save")
	public Register dosave(@RequestBody Register s) {
		Register st = regsRepo.save(s);
		System.out.println("Register");
		return st;
	}

	// =======================add patient admission table==============

	@PostMapping("/addpatientadmission")
	public Admissiontable addpatientadmission(@RequestBody Admissiontable s) {
		HmsDa da = new HmsDa();
		Admissiontable st = da.addpatientadmission(s);
		return st;
	}
	// =======================post into bill_sum table==============

	@PostMapping("/insertpaybill")
	public BillSum insertIntoBillSumTable(@RequestBody BillSum s) {
		System.out.println("controller works=>"+s);
		
		HmsDa da = new HmsDa();
		BillSum st = da.insertIntoBillSum(s);
		return st;
	}
	// -------------------------- insert patient-----------------------

	@PostMapping("/patientapply")
	public Patientapply addpatient(@RequestBody Patientapply s) {
		HmsDa da = new HmsDa();
		Patientapply data = da.patientapply(s);

		return data;
	}
	
	// -------------------------- insert patient-----------------------

		@PostMapping("/addprescription")
		public Prescription addprescription(@RequestBody Prescription s) {
			HmsDa da = new HmsDa();
			Prescription data = da.addprescription(s);

			return data;
		}

	// ----------------------------------------------------------login-------------------------

	@GetMapping("login/{username}/{password}")
	public Register m3(@PathVariable String username, @PathVariable String password) {
//		HmsDa da = new HmsDa();

		Register pp = regsRepo.findByUsernameAndPassword(username, password);
//		System.out.println("Register");

		return pp;
	}

	// --------------------------search a patient info----------------------

	@GetMapping("/getadmitpatient/{nid}")
	public Patientapply getpatientbynid(@PathVariable int nid) {
		HmsDa da = new HmsDa();
		Patientapply data = da.getpatientinfo(nid);
		return data;

	}
	
	// --------------------------search a patient info----------------------

		@GetMapping("/getpatienttreat/{p_id}")
		public Admissiontable getpatienttreat(@PathVariable int p_id) {
			HmsDa da = new HmsDa();
			Admissiontable data = da.getpatienttreat(p_id);
			return data;

		}
	
	// --------------------------search single patient appointment status---------myself-------------

		@GetMapping("/getSinglePatient/{p_id}")
		public Appointment getDataByPatientId(@PathVariable int p_id) {
			HmsDa da = new HmsDa();
			Appointment data = da.getAppStatus(p_id);
			return data;

		}
		// --------------------------search single patient prescription---------myself-------------

				@GetMapping("/getSinglePrescription/{p_id}")
				public Prescription getPrescriptionByP_id(@PathVariable int p_id) {
					HmsDa da = new HmsDa();
					Prescription data = da.getPrescription(p_id);
					return data;

				}
	// --------------------------------------show department-----

	List<Department> slist = new ArrayList<>();

	@GetMapping("/showalldept")
	public List<Department> showalldept() {
		HmsDa da = new HmsDa();
		slist = da.showAll();

		return slist;
	}

	// --------------------------------------show all patient-----

	List<Patientapply> slist1 = new ArrayList<>();

	@GetMapping("/showallpatient")
	public List<Patientapply> showallpatient() {
		HmsDa da = new HmsDa();
		slist1 = da.showAllpatient();

		return slist1;
	}

	// ----------------------show all doctor name-----

	List<Doctor> getdoc = new ArrayList<>();

	@GetMapping("/getdoctorname/{dep_id}")
	public List<Doctor> getalldoctor(@PathVariable int dep_id) {
		HmsDa da = new HmsDa();
		getdoc = da.getalldoctor(dep_id);

		return getdoc;
	}

	// --------------------------------------------insert
	// app_ststus------------------------------

	@PostMapping("/saveStatus")
	public App_status dosave(@RequestBody App_status s) {
		App_status st = appRepo.save(s);
		System.out.println("Register");
		return st;
	}

	// ----------------insert appointment table--------

	@PostMapping("/saveappointment")
	public Appointment alldatasave(@RequestBody Appointment s) {
		HmsDa da = new HmsDa();
		Appointment save = da.alldatasave(s);
		return save;
	}

	// ----------------search by p_id-----------------------
	List<Appointment> getpatient = new ArrayList<>();

	@GetMapping("/getallpatient/{doc_name}")
	public List<Appointment> getallpatient(@PathVariable String doc_name) {

		HmsDa da = new HmsDa();
		getpatient = da.getallpatient(doc_name);
		return getpatient;

	}
	
	// ----------------search by doctor id and get all patient-----------------------
	
		List<Admissiontable> getallpatient = new ArrayList<>();

		@GetMapping("/getalladmissionpatient/{d_id}")
		public List<Admissiontable> getalladmissionpatient(@PathVariable String d_id) {

			HmsDa da = new HmsDa();
			getallpatient = da.getalladmissionpatient(d_id);
			return getallpatient;

		}
		
		// ----------------show all admitted patient-----------------------
		
			List<Admissiontable> showalladmitpatient = new ArrayList<>();

			@GetMapping("/getadmittedpatientdata")
			public List<Admissiontable> getadmittedpatient() {

				HmsDa da = new HmsDa();
				showalladmitpatient = da.getadmittedpatient();
				return showalladmitpatient;

			}


	// -------------------------------update--------------------------
//		@PutMapping("/update")
//		public Bank doupdate(@RequestBody  Bank s) {
//			BankDa da1= new BankDa();
//			Bank up = da1.update(s);
//			return up;
//		}

	// --------------------delete patient------------------ 

	@DeleteMapping("/deletepatient/{p_id}")
	public Appointment deletepatient(@PathVariable int p_id) {
		HmsDa da = new HmsDa();
		Appointment data = da.deletePatient(p_id);
		return data;
	}
	
	// --------------------discharge patient------------------ 

		@DeleteMapping("/dischargepatient/{p_id}")
		public Admissiontable dischargepatient(@PathVariable int p_id) {
			HmsDa da = new HmsDa();
			Admissiontable data = da.dischargepatient(p_id);
			return data;
		}
		
		//========================get patient id==============
		@GetMapping("/getpaitentid/{nid}")
		public Admissiontable getpatientId(@PathVariable int nid) {
			System.out.println("Nid=> "+nid);
			HmsDa da = new HmsDa();
			
			return da.getpatientId(nid);

		}
	
	// ------------------ delete application patient ------------------ 

		@DeleteMapping("/deletepatientapply/{nid}")
		public Patientapply deletepatientapply(@PathVariable int nid) {
			HmsDa da = new HmsDa();
			Patientapply data = da.deletePatientapply(nid);
			return data;
		}

		// ------------------ create paitent Bill ------------------
		@PostMapping("/savepaymentonappointment")
		public void savePaymentOnAdmission(@RequestBody Payment s) {
			HmsDa da = new HmsDa();
			da.paymentAdd(s);
			
		}
		
		@GetMapping("/savebillonadmission/{pid}/{date}")
		public void saveBilOnAdmission(@PathVariable int pid, @PathVariable Date date) {
			System.out.println("P-id=>"+pid);
			System.out.println("Date=>"+date);
			HmsDa da = new HmsDa();
			da.billAddOnAdmission(pid, date);
		}
		
		@PostMapping("/savepaymentondischarge")
		public void savePaymentOnDischarge(@RequestBody Bill b) {
			HmsDa da = new HmsDa();
			da.billPay(b);
			
		}
		
		
		
		@GetMapping("/updateconsultationfee/{ammount}/{id}")
		public void updateconsultationFee(@PathVariable double ammount, @PathVariable int id) {
			System.out.println(ammount);
			System.out.println(id);
			HmsDa da = new HmsDa();
			da.updateConsultationFee(ammount, id);
		}
		
		@GetMapping("/updatemedicalbill/{ammount}/{id}")
		public void updateMedicineBill(@PathVariable double ammount, @PathVariable int id) {
			System.out.println(ammount);
			System.out.println(id);
			HmsDa da = new HmsDa();
			da.updateMedicineBill(ammount, id);
		}
		
		@GetMapping("/updatetestbill/{ammount}/{id}")
		public void updateTestChargeBill(@PathVariable double ammount, @PathVariable int id) {
			System.out.println(ammount);
			System.out.println(id);
			HmsDa da = new HmsDa();
			da.updateTestChargeBill(ammount, id);
		}
		
		//=========================get paitent detais from payment======================
		
		@GetMapping("/getallpatientdatafrompayment/{id}")
		public Payment getAllPatientDataFromPayment(@PathVariable int id) {
			System.out.println(id);
			HmsDa da = new HmsDa();
			return da.getAllPaymentPatientData( id);
		}
		
		
		//=========================get all records from payment======================
		
		List<Payment> searchrecords = new ArrayList<>();
	
		@GetMapping("/allRecords/{dateFrom}/{dateTo}")
		public List<Payment> getadmittedpatient(@PathVariable Date dateFrom,@PathVariable Date dateTo ) {
	
			HmsDa da = new HmsDa();
			searchrecords = da.getadmittedpatient(dateFrom, dateTo);
			return searchrecords;
	
		}
}
