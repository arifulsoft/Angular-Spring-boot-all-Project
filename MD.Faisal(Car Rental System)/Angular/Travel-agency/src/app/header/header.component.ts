import { Component, OnInit } from '@angular/core';
import { ProductService } from '../services/product.service';
import { CarService } from '../services/car.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private carservice:CarService) { }
  totalNumber:number=0;
  ngOnInit(): void {

    // this.carservice.getDetailsofCar.subscribe(res=>{this.totalNumber=res.length})

  }

}
