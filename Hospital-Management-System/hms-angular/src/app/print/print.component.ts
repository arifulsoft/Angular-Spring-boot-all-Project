import { Component, OnInit } from '@angular/core';
import { HmsService } from '../hms.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-print',
  templateUrl: './print.component.html',
  styleUrls: ['./print.component.css']
})
export class PrintComponent implements OnInit {

  p_id: any
  p_name: any
  phone: any
  ad_date: any
  dis_date: any
  tnad:any
  ad_amt: any
  pdbc: any
  tbc: any
  doc_fee: any
  m_bill: any
  t_bill: any
  total: any
  discount: any
  n_amt: any
  paid: any
  due: any
  status: any


  allpatientdata:any;
  getdata:any;
  constructor(private myservice:HmsService, private router:Router) { 
    this.p_id=this.router.getCurrentNavigation()?.extras.state?.["p_id"];
    this.allpatientdata=this.router.getCurrentNavigation()?.extras.state?.["alldata"];
    this.myservice.getmedpatient(this.p_id).subscribe((x) => {
      this.getdata = x;
      this.p_name = this.getdata.p_name;
      this.phone = this.getdata.phone;
    });
    this.ad_date=this.allpatientdata.ad_date;
    this.dis_date=this.allpatientdata.dis_date;
    this.tnad=this.allpatientdata.tnad;
    this.ad_amt=this.allpatientdata.ad_amt;
    this.pdbc=this.allpatientdata.pdbc;
    this.tbc=this.allpatientdata.tbc;
    this.doc_fee=this.allpatientdata.doc_fee;
    this.m_bill=this.allpatientdata.m_bill;
    this.t_bill=this.allpatientdata.t_bill;
    this.total=this.allpatientdata.total;
    this.discount=this.allpatientdata.discount;
    this.n_amt=this.allpatientdata.n_amt;
    this.paid=this.allpatientdata.paid;
    this.due=this.allpatientdata.due;
    this.status=this.allpatientdata.status;
  
    this.searchpatient();
    // this.vat=this.fee*15/100;

    setTimeout(function(){
      window.print()
    },1000);

   }

  ngOnInit() {

  }

  invoice(){
    // if(this.feestype=="c_fee"){
    //   this.myservice.updateConsultationFee(this.fee,this.p_id).subscribe(()=>{alert("C_fee Works")});
    // }else if(this.feestype=="m_bill"){
    //   this.myservice.updateMedicalBill(this.fee,this.p_id).subscribe(()=>{alert("m_bill Works")});
    // }else if(this.feestype=="t_charge"){
    //   this.myservice.updateTestBill(this.fee,this.p_id).subscribe(()=>{alert("t_charge Works")});
    // }
    
  }
  searchpatient(){
    this.myservice.getAllpatientDataFromPayment(this.p_id).subscribe((x)=>{
    //   this.allpatientdata=x;
    //   this.p_name=this.allpatientdata.p_name;
    //   this.d_id=this.allpatientdata.d_id;
    //   this.age=this.allpatientdata.age;
    //   this.phone=this.allpatientdata.phone;
    //   this.c_fee=this.allpatientdata.c_fee;
    //   this.pdbc=this.allpatientdata.pdbc;
    //   this.tbc=this.allpatientdata.tbc;
    //   this.m_bill=this.allpatientdata.m_bill;
    //   this.t_charge=this.allpatientdata.t_charge;
    //   this.vat=this.allpatientdata.vat;
    //   this.t_amt=this.allpatientdata.t_amt;
    //   this.discount=this.allpatientdata.discount;
    //   this.n_amt=this.allpatientdata.n_amt;
    })
    
  }
    
  
  // print(){
  //   window.print();
  // }


}