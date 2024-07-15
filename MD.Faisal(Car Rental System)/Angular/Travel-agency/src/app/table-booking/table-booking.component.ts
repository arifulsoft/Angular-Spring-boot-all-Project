import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-table-booking',
  templateUrl: './table-booking.component.html',
  styleUrls: ['./table-booking.component.css']
})
export class TableBookingComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  name:any;
  phone_number:any;
  table_type:any;
  booking_date:any;
  booking_time:any;
  message:any;

booking(){

  
}

}
