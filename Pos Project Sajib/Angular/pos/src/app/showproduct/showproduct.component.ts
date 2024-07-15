import { Component, OnInit } from '@angular/core';
import { ProductService } from '../services/product.service';

@Component({
  selector: 'app-showproduct',
  templateUrl: './showproduct.component.html',
  styleUrls: ['./showproduct.component.css']
})
export class ShowproductComponent implements OnInit {
  
  getalldata:any;
  constructor(private myservice:ProductService) {
    this.myservice.showallproduct().subscribe((x)=>{
      this.getalldata=x;
    });
   }

  ngOnInit(): void {
  }

}
