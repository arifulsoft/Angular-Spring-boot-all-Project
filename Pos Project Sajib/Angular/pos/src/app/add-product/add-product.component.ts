import { Component, OnInit } from '@angular/core';
import { ProductService } from '../services/product.service';
import { Router } from '@angular/router';
import { Product } from '../models/product';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  constructor(private myservice:ProductService, private router:Router) { }
  
  id:any;
  barcode:any;
  name:any;
  description:any;
  quantity:any;
  purchase_rate:any;
  sales_rate:any;
  size:any;
  category:any;
  colors:any;
  stock:any;
  supplier:any;

  allProducts:any;

  addProduct(){
    this.allProducts = new Product(this.id,this.barcode,this.name,this.description,this.quantity,this.purchase_rate,this.sales_rate, this.size,this.category,this.colors,this.stock,this.supplier);
    this.myservice.addProduct(this.allProducts).subscribe(()=>{
    alert("Add Items Successfully");
    this.router.navigateByUrl("showproduct");
    });

  }

  ngOnInit(): void {
  }

}
