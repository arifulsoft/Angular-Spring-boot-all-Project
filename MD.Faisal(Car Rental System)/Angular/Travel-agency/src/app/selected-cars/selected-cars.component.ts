import { Component, OnInit } from '@angular/core';
import { CarService } from '../services/car.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Carbooking } from '../models/carbooking';

@Component({
  selector: 'app-selected-cars',
  templateUrl: './selected-cars.component.html',
  styleUrls: ['./selected-cars.component.css'],
})
export class SelectedCarsComponent implements OnInit {
  allCars: any[] = [];
  length: any;

  nid: any;
  name: any;
  m_number: any;
  from: any;
  to: any;
  car_name: any;
  car_number: any;
  car_seating: any;
  rent_per_day: number=0;
  total_day: number=0;
  amount: number=0;
  booking_date: any;
  return_date: any;
  advance_payment: number=0;
  due: number=0;

  carData: any;


  totalAmount(){
    this.amount=this.rent_per_day*this.total_day;
  }

  advanceAmount(){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
this.due=this.amount-this.advance_payment;

  }
  
  constructor(
    private carService: CarService,
    private router: Router,
    private route: ActivatedRoute
  ) {
    this.allCars = carService.getDetailsofCar();
    this.length = this.allCars.length;

    this.car_name = this.allCars[0].car_name;
    this.car_number = this.allCars[0].car_number;
    this.car_seating = this.allCars[0].car_seating;
    this.rent_per_day = this.allCars[0].rent_per_day;

    

    // this.allCars=this.carService=

    this.getAllcars=this.router.getCurrentNavigation()?.extras.state?.["response"];
  }
  getAllcars:any;
  ngOnInit(): void {
    // this.router.getCurrentNavigation().extras.state?.example;
  }
  // --------- Insert into Carbooking Table--------

  add() {
    this.carData = new Carbooking(
      this.nid,
      this.name,
      this.m_number,
      this.from,
      this.to,
      this.car_name,
      this.car_number,
      this.car_seating,
      this.rent_per_day,
      this.total_day,
      this.amount,
      this.booking_date,
      this.return_date,
      this.advance_payment,
      this.due
    );
    this.carService.saveIntoCarBookingTable(this.carData).subscribe(() => {});
    alert('Successfully submitted');
    this.nid = 0;
    this.name = '';
    this.m_number = '';
    this.from = '';
    this.to = '';
    this.car_name = '';
    this.car_number = '';
    this.car_seating = 0;
    this.rent_per_day = 0;
    this.total_day = 0;
    this.amount = 0;
    this.booking_date = 0;
    this.return_date = 0;
    this.advance_payment = 0;
    this.due = 0;
  }

  // days: number = 1;
  // total_rent: any;

  // // this.total_rent = this.days * this.allCars.rent_per_day;

  // changeValue(val: any, rent_per_day: any) {
  //   this.total_rent = val * rent_per_day;
  // }

  // total_rent_3: any = 0;
  // changeDay(val: any) {
  //   this.total_rent = parseInt(val) * parseFloat(this.allCars.rent_per_day);
  // }
  // qq = 1;
  // remove(p: any) {
  //   // this.allCars = this.allCars.filter( (obj: any) => obj.serial_no !== p.serial_no );
  //   // this.allCars.pop();
  //   this.allCars.splice(p, 1);

  //   if (this.allCars.length > 0) {
  //     this.length = this.allCars.length;
  //   } else {
  //     this.allCars = [];
  //     this.length = this.allCars.length;
  //   }
  // }

  // saveAllcars: any;

  // saveCarToDatabase() {
  //   this.saveAllcars = this.allCars;
  //   this.router.navigateByUrl('payment', {
  //     state: { response: this.saveAllcars },
  //   });

  //   // alert(val)
  // }
}
