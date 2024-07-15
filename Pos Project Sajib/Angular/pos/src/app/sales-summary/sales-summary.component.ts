import { Component, OnInit } from '@angular/core';
import { ProductService } from '../services/product.service';
import { TransectionService } from '../services/transection.service';

@Component({
  selector: 'app-sales-summary',
  templateUrl: './sales-summary.component.html',
  styleUrls: ['./sales-summary.component.css']
})
export class SalesSummaryComponent implements OnInit {



  getallTransection:any;
  constructor(private myservice:TransectionService) {
    this.myservice.showalltransection().subscribe((x)=>{
      this.getallTransection=x;
    });
   }

  ngOnInit(): void {
  }

}
