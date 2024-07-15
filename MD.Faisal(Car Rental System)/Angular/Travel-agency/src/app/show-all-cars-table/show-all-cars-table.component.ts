import { Component, OnInit } from '@angular/core';
import { CarService } from '../services/car.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-show-all-cars-table',
  templateUrl: './show-all-cars-table.component.html',
  styleUrls: ['./show-all-cars-table.component.css']
})
export class ShowAllCarsTableComponent implements OnInit {
  getAllcars:any;

  constructor( private router:Router) { 
    
     
    // this.getAllcars=this.router.getCurrentNavigation()?.extras.state?.["response"];
  }

  ngOnInit(): void {
  }

}
