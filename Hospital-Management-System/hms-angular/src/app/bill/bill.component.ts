import { Component, OnInit } from '@angular/core';
import { HmsService } from '../hms.service';
import { Bill } from '../models/bill';

@Component({
  selector: 'app-bill',
  templateUrl: './bill.component.html',
  styleUrls: ['./bill.component.css']
})
export class BillComponent implements OnInit {
    id: any
    p_id: any
    ad_date: any
    t_charge: any
    t_chargewithbed:any;
    paid: any
    due: any
    status: any
    dis_date:any;
    paybill:any;
    
    admissionday:any;
    allpatientdata:any;
  constructor(private billService:HmsService) { }

  ngOnInit() {
  }
  billdata:any;
bill(){
  this.due=this.t_charge-this.paybill;
  this.billdata=new Bill(0,this.p_id,this.ad_date,this.t_charge,this.paybill,this.due,"paid",this.dis_date);
  this.billService.billPayment(this.billdata).subscribe(()=>{alert("Bill Successfully Paid")})
}
search(){
  this.billService.getAllpatientDataFromPayment(this.p_id).subscribe((x)=>{
    this.allpatientdata=x;
    this.ad_date=this.allpatientdata.date;
    let Admissiondate=new Date(this.ad_date);
    let dischargeDate=new Date(this.dis_date);
    this.admissionday=Math.floor((Date.UTC(dischargeDate.getFullYear(), dischargeDate.getMonth(), dischargeDate.getDate()) - Date.UTC(Admissiondate.getFullYear(), Admissiondate.getMonth(), Admissiondate.getDate()) ) /(1000 * 60 * 60 * 24));
  
    this.t_charge=this.allpatientdata.n_amt;
    this.t_chargewithbed=this.t_charge+(this.allpatientdata.pdbc*this.admissionday);
    this.paid=0;
    this.due=this.t_chargewithbed-this.paid;
    this.status="Due";
    
  })
}

}


