import { Component, OnInit } from '@angular/core';
import { CarService } from '../services/car.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
  constructor(private carservice: CarService, private router: Router) {}

  ngOnInit(): void {}
  from: any;
  to: any;
  // booking_date: any;
  // return_date: any;
  allcars: any = [];

  search_2() {
    
    this.carservice.search(this.from, this.to).subscribe((x) => {
      this.allcars = x;
      if (this.allcars != null) {
        this.router.navigateByUrl('allcars');
        alert('Login Successful');
      } else {
        this.router.navigateByUrl('fail');
      }
    });
  }
}
