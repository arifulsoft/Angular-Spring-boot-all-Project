import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HmsService } from '../hms.service';
import { Admissiontable } from '../models/admissiontable';
import { Payment } from '../models/payment';

@Component({
  selector: 'app-patientadmission',
  templateUrl: './patientadmission.component.html',
  styleUrls: ['./patientadmission.component.css']
})
export class PatientadmissionComponent implements OnInit {

  p_id: any;
  p_name: any;
  dep_name: any;
  d_id: any;
  d_name: any;
  nid: any;
  age: any;
  address: any;
  phone: any;
  problem: any;


  getdata: any;
  allData: any = [];
  constructor(private router: Router, private myservice: HmsService) {

    this.myservice.showalldept().subscribe((x) => {
      this.allData = x;
    });

    this.getdata = this.router.getCurrentNavigation()?.extras.state?.["response"];
    this.p_name = this.getdata.name;
    this.nid = this.getdata.nid;
    this.age = this.getdata.age;
    this.address = this.getdata.address;
    this.phone = this.getdata.phone;
    this.problem = this.getdata.problem;
    this.myservice.getpatientId(this.nid).subscribe((x)=>{
      this.newPatientId=x.p_id;
      alert("patient id => "+this.newPatientId);
      
   
    });
  }

  ngOnInit() {
  }
  // -------------insert data in admission table ---------------
  setpatientdata: any;
  admission() {
    this.setpatientdata = new Admissiontable(this.p_id, this.p_name, this.dep_name,
      this.d_id, this.d_name, this.nid, this.age, this.address, this.phone, this.problem);
    this.myservice.addadmission(this.setpatientdata).subscribe(() => {
      this.myservice.addbillonadmission(this.p_id,this.date).subscribe(()=>{
        alert("Bill Aded")
      });
      this.addBillOnAdmission();
      this.bill();
     
      this.p_id="";
      this.p_name="";
      this.dep_name="";
      this.d_id="";
      this.d_name="";
      this.nid="";
      this.age="";
      this.address="";
      this.phone="";
      this.problem="";
    });
  }



  departmentId: any;
  data: any = [];
  changeDep(p: any) {
    this.departmentId = this.allData[p].dep_id;
    this.myservice.getdocname(this.departmentId).subscribe((x) => {
      this.data = x;
    });
  }

  delete(){
    this.myservice.deletepatientapply(this.nid).subscribe(()=>{ 
      alert("Successful");
      this.router.navigateByUrl("showpatient");
    });
  }

  // (p_id:any, p_name:any, d_id:any, age:any, phone:any, c_fee:any, pdbc:any, tbc:any, m_bill:any,t_charge:any, vat:any, t_amt:any, discount:any,n_amt:any, date:any,admissionCharge:any)

  admissionbill:any;
  date:any;
  newPatientId:any;
  addBillOnAdmission(){
  
    this.admissionbill = new Payment(this.newPatientId,this.p_name,this.d_id,this.age,this.phone,0,0,0,0,0,0,0,0,0,this.date,0);
    
    this.myservice.addBillOnAppointment(this.admissionbill).subscribe(()=>{
  
    });
    
  }
  bill(){
    
  }
}
