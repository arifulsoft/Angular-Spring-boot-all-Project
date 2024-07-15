import { Component, OnInit } from '@angular/core';
import { CarService } from '../services/car.service';
import { BookingApprovalTable } from '../models/booking-approval-table';
import { Router } from '@angular/router';

@Component({
  selector: 'app-show-carbooking-table',
  templateUrl: './show-carbooking-table.component.html',
  styleUrls: ['./show-carbooking-table.component.css'],
})
export class ShowCarbookingTableComponent implements OnInit {

  getAllBooking: any;

  constructor(private carService: CarService, private router: Router) {
    this.carService.showCarBookingTable().subscribe((x) => {
      this.getAllBooking = x;
    });
  }

  ngOnInit(): void {}

  nid: any;
  name: any;
  mobile_number: any;
  from: any;
  to: any;
  car_number: any;
  booking_date: any;
  total_day: any;
  total_rent: any;
  due_rent: any;
  advance_payment:any;
  status: any;

  getData: any;
  approved(nid: any) {
    this.carService.getRequestById(nid).subscribe((x) => {
      this.getData = x;

      this.nid = this.getData.nid;
      this.name = this.getData.name;
      this.mobile_number = this.getData.m_number;
      this.from = this.getData.from;
      this.to = this.getData.to;
      this.car_number = this.getData.car_number;
      this.booking_date = this.getData.booking_date;
      this.total_day = this.getData.total_day;
      this.total_rent = this.getData.amount;
      this.due_rent = this.getData.due;
      this.advance_payment=this.getData.advance_payment;
      
       this.statussave();

       this.delete();
       alert("sueccessful");
    });
    
  }

  postalldata: any;
  statussave() {
    this.postalldata = new BookingApprovalTable(
      this.nid,
      this.name,
      this.mobile_number,
      this.from,
      this.to,
      this.car_number,
      this.booking_date,
      this.total_day,
      this.total_rent,
      this.due_rent,
      this.advance_payment,
      this.status
    );
    this.carService.insertApproval(this.postalldata).subscribe(() => {
     
    });
  }

  reject(nid: any) {
    this.carService.deletecarbooking(nid).subscribe(() => {
      this.carService.showCarBookingTable().subscribe((x) => {
        this.getAllBooking = x;
        this.router.navigateByUrl('showCarbookingTable');
      });
    });
  }

  delete() {
    this.carService.deletecarbooking(this.nid).subscribe(() => {
      this.carService.showCarBookingTable().subscribe((x) => {
        this.getAllBooking = x;
        this.router.navigateByUrl('showCarbookingTable');
      });
    });
  }

}
