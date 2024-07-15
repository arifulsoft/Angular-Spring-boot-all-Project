import { Component, OnInit } from '@angular/core';
import { CarService } from '../services/car.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-all-cars',
  templateUrl: './all-cars.component.html',
  styleUrls: ['./all-cars.component.css']
})
export class AllCarsComponent implements OnInit {
  getAllcars: any;
  allCars:any[]=[];
  length:any;
  constructor(private carService:CarService,private router:Router) { 

      this.carService.show().subscribe((x) => { this.getAllcars = x });
      this.allCars=this.carService.getDetailsofCar().slice();
      this.length=this.allCars.length;
      // this.router.navigateByUrl("showCars",{state:{response:this.allCars}})
    
  }

  ngOnInit(): void {
  }
  car:any;
book(i:any){


  this.carService.addDetailsToCar(i);
  this.allCars=this.carService.getDetailsofCar().slice();

  
  // this.car=this.allCars[i];
  // this.router.navigateByUrl("/payment",{state:{car:this.car}});
 
  // this.router.navigateByUrl("showCars",{state:{response:this.allCars}})

//  this.carService.addDetailsToCar(i);


}

}
