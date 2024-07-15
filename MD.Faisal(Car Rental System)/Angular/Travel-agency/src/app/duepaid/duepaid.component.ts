import { Component, OnInit } from '@angular/core';
import { CarService } from '../services/car.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-duepaid',
  templateUrl: './duepaid.component.html',
  styleUrls: ['./duepaid.component.css'],
})
export class DuepaidComponent implements OnInit {
  
  nid: any;

  constructor(private carService: CarService, private router:Router) {}

  ngOnInit(): void {}

  getData: any;
  duepaid() {
    this.carService.searchRequestById(this.nid).subscribe((x) => {
      this.getData = x;
      this.due = this.getData.due_rent;
      this.totalamount = this.getData.total_rent;
      this.advancepaid=this.getData.advance_payment;
    });
  }

  due: any;
  paymentType: any = 'Cash Payment';
  totalamount: any;
  payAmmount:any;
  netSale:any;
  return:any;
  advancepaid:any;

  Discount:any;

  calculate() {
    this.netSale = this.due - this.Discount;
    this.return = this.payAmmount - this.netSale;
  }

  saleConfirm(){
    alert("Dear Customer, Your Payment Successful");
    // this.router.navigateByUrl("home");

  }
  print(){

    window.print()
  }
  
}
