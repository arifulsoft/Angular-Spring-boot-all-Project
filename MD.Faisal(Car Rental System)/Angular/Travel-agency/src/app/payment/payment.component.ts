import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CarService } from '../services/car.service';
import { CarTransactionTable } from '../models/car-transaction-table';
import { NgFor } from '@angular/common';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css'],
})
export class PaymentComponent implements OnInit {
  serial_no:any;
  car_name: any;
  car_number: any;
  rent_per_day: any;
  days: any;
  total_rent: any;
  from: any;
  to: any;
  booking_date: any;
  return_date: any;
  advance_payment: any;
  name: any;
  nid: any;
  mobile: any;

  getAllCars: any;
  // car:any;
  CarTransactionTable_object: any;
  constructor(private router: Router, private carservice: CarService) {
    // this.car= this.router.getCurrentNavigation()?.extras.state?.['car'];

    this.getAllCars =
      this.router.getCurrentNavigation()?.extras.state?.['response'];

    this.car_name = this.getAllCars.car_name;
    this.car_number = this.getAllCars.car_number;
    this.rent_per_day = this.getAllCars.rent_per_day;
    this.days = this.getAllCars.days;
    this.total_rent = this.getAllCars.total_rent;
    this.from = this.getAllCars.from;
    this.to = this.getAllCars.to;
  }

  ngOnInit(): void {}
  allCarsData: any[]=[];
  setCarsToDatabase: any;
  saveToDatabase() {
    for(let i of this. getAllCars){
      //(serial_no: any,car_name: any,car_number: any,from: any, to: any,booking_date: any, return_date: any,total_rent: any, customer_nid: any,customer_mobile_no: any, customer_name: any,total_days: any,advance_payment: any )


      // serial_no, car_name, car_number, from, to, booking_date, return_date, total_rent, customer_name, customer_nid, customer_mobile_no, total_days, advance_payment
      
      this.setCarsToDatabase = new CarTransactionTable(1,i.car_name, i.car_number,
        this.from,
        this.to,
        this.booking_date,
        this.return_date,
        (i.total*i.rent_per_day),
        this.nid,
        this.mobile,
        this.name,
        i.total,
        this.advance_payment,
      );
      alert(i.total);
   this. allCarsData.push(this.setCarsToDatabase);
    }
    
this.carservice.insertTransactionTable(this.allCarsData).subscribe(()=>{
  alert("Submitted successfully")
})



  }
}
