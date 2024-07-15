import { Component, OnInit } from '@angular/core';
import { ControllerrService } from 'src/app/service/controllerr.service';

@Component({
  selector: 'app-accounts',
  templateUrl: './accounts.component.html',
  styleUrls: ['./accounts.component.css']
})
export class AccountsComponent implements OnInit {

  constructor(private myservice:ControllerrService) {
    this.myservice.getAccountsDetails().subscribe((x)=>{
      this.accountsDetails=x;
    })
   }

  ngOnInit(): void {
  }

  accountsDetails:any;

  service:any="accounts";
  changeService(valu:any){
    this.service=valu;
  }

  startDate:any;
  endDate:any;
  totalCredit:any=0;
  totalDebit:any=0;
  balance:any=0;
  transactionData:any=[];
  showTransactionData:any[]=[];
  // { "transactionId": 1, "transactionDate": "2024-07-12", "invoice_no": "20240711033102", "purpose": "Sale", "transactionType": "Credit", "ammount": 543.5, "balance": 0 }
  transactionDataObject:any={ transactionId: 1, transactionDate: "2024-07-12", invoice_no: "20240711033102", purpose: "Sale", credit: 0,debit: 0, balance: 0 }

  getTransactainData(){
    this.totalCredit=0;
    this.totalDebit=0;
    this.balance=0;
    this.showTransactionData=[];
    this.myservice.getTransection(this.startDate,this.endDate).subscribe((x)=>{
      alert("Data recived")
      this.transactionData=x;
    for(let i of this.transactionData){
      if(i.transactionType=="Credit"){
        this.transactionDataObject=new Object;
        this.transactionDataObject.transactionId=i.transactionId;
        this.transactionDataObject.transactionDate=i.transactionDate;
        this.transactionDataObject.invoice_no=i.invoice_no;
        this.transactionDataObject.purpose=i.purpose;
        this.transactionDataObject.credit=i.ammount;
        this.transactionDataObject.debit=0;
        this.transactionDataObject.balance=i.balance;
        this.showTransactionData.push(this.transactionDataObject);

        this.totalCredit=this.totalCredit+i.ammount;
      }else if(i.transactionType=="Debit"){
        this.transactionDataObject=new Object;
        this.transactionDataObject.transactionId=i.transactionId;
        this.transactionDataObject.transactionDate=i.transactionDate;
        this.transactionDataObject.invoice_no=i.invoice_no;
        this.transactionDataObject.purpose=i.purpose;
        this.transactionDataObject.credit=0;
        this.transactionDataObject.debit=i.ammount;
        this.transactionDataObject.balance=i.balance;
        this.showTransactionData.push(this.transactionDataObject);

        this.totalDebit=this.totalDebit+i.ammount;
      }
      
    }
    this.balance=this.showTransactionData.at(0).balance+this.totalCredit-this.totalDebit;

    });
  }
}
