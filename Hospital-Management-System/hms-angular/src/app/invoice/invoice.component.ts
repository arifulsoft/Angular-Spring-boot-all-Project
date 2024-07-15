import { Component, OnInit } from '@angular/core';
import { HmsService } from '../hms.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-invoice',
  templateUrl: './invoice.component.html',
  styleUrls: ['./invoice.component.css']
})
export class InvoiceComponent implements OnInit {
  p_id: any
  p_name: any
  d_id: any
  age: any
  phone: any
  c_fee: any
  pdbc: any
  tbc: any
  m_bill: any
  t_charge: any
  vat: any
  t_amt: any
  discount: any
  n_amt: any
  date: any
  feestype:any="Select Service Type";
  fee:any;

  allpatientdata:any;

  constructor(private myservice:HmsService,private router:Router) { 
    this.vat=this.fee*15/100;
  }

  ngOnInit() {
  }

  invoice(){
    if(this.feestype=="c_fee"){
      this.myservice.updateConsultationFee(this.fee,this.p_id).subscribe(()=>{
this.router.navigateByUrl("/PrintComponent",{state:{p_id:this.p_id}})
      });
    }else if(this.feestype=="m_bill"){
      this.myservice.updateMedicalBill(this.fee,this.p_id).subscribe(()=>{
        this.router.navigateByUrl("/PrintComponent",{state:{p_id:this.p_id}})
      });
    }else if(this.feestype=="t_charge"){
      this.myservice.updateTestBill(this.fee,this.p_id).subscribe(()=>{
        this.router.navigateByUrl("/PrintComponent",{state:{p_id:this.p_id}})
      });
    }
    alert("your payment is submitted successfully")
  }
  searchpatient(){
    this.myservice.getAllpatientDataFromPayment(this.p_id).subscribe((x)=>{
      this.allpatientdata=x;
      this.p_name=this.allpatientdata.p_name;
      this.d_id=this.allpatientdata.d_id;
      this.age=this.allpatientdata.age;
      this.phone=this.allpatientdata.phone;
      // this.c_fee=this.allpatientdata.c_fee;
      // this.pdbc=this.allpatientdata.pdbc;
      // this.tbc=this.allpatientdata.tbc;
      // // this.m_bill=this.allpatientdata.m_bill;s
      // this.t_charge=this.allpatientdata.t_charge;
      // this.vat=this.allpatientdata.vat;
      // this.t_amt=this.allpatientdata.t_amt;
      // this.discount=this.allpatientdata.discount;
      // this.n_amt=this.allpatientdata.n_amt;
    })
    
  }
print(){
  
  window.print();
}
}