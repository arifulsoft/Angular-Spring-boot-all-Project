import { Component, OnInit } from '@angular/core';
import { HmsService } from '../hms.service';
import { BillSum } from '../models/billSum';
import { Router } from '@angular/router';

@Component({
  selector: 'app-patientBill',
  templateUrl: './patientBill.component.html',
  styleUrls: ['./patientBill.component.css']
})
export class PatientBillComponent implements OnInit {

  id: any
  p_id: any
  p_name: any
  phone: any
  ad_date: any;
  dis_date: any
  datecalculation(){
    let admissionDate=new Date(this.ad_date);
    let discharge=new Date(this.dis_date);
    this.tnad=Math.floor((Date.UTC(discharge.getFullYear(),discharge.getMonth(),discharge.getDate())-Date.UTC(admissionDate.getFullYear(),admissionDate.getMonth(),admissionDate.getDate()))/(1000*60*60*24));
  }
  tnad:any;
  ad_amt:any;
  pdbc:any;
  tbc:any;
  doc_fee: any
  m_bill: any
  t_bill: any
  total: any
  discount: any
  n_amt: any
  paid: any
  due: any
  status: any

  constructor(private myservice: HmsService, private router:Router) { }




  getdata: any;
  searchpatient() {
    this.myservice.getmedpatient(this.p_id).subscribe((x) => {
      this.getdata = x;
      this.p_name = this.getdata.p_name;
      this.phone = this.getdata.phone;
    });
  }

  alldata:any;
  payment() {
    this.tbc=this.pdbc*this.tnad;
    this.total=this.ad_amt+this.tbc+this.m_bill+this.t_bill+this.doc_fee;
    this.n_amt=this.total-(this.total*this.discount/100);
    this.alldata=new BillSum(this.id, this.p_id, this.p_name, this.phone, this.ad_date, this.dis_date, this.tnad, this.ad_amt, this.pdbc, this.tbc, this.doc_fee, this.m_bill, this.t_bill, this.total, this.discount, this.n_amt, this.paid, this.status);
    this.myservice.insertpaybill(this.alldata).subscribe(()=>{
      alert("Dear sir,your payment is successfull");
    });
    this.router.navigateByUrl("PrintComponent",{state:{p_id:this.p_id,alldata:this.alldata}})
  }





  ngOnInit() {
  
  }

}
