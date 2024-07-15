import { Component, OnInit } from '@angular/core';
import { ProductService } from '../services/product.service';
import { Router } from '@angular/router';
import { Product } from '../models/product';

@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.css']
})
export class UpdateProductComponent implements OnInit {

  barcode: any;
  name: any;
  description: any;
  quantity: any;
  purchase_rate: any;
  sales_rate: any;
  size: any;
  category: any;
  colors: any;
  stock: any;
  supplier: any;

  getdata: any = [];
  constructor(private myservice: ProductService, private router: Router) {
    this.getdata = this.router.getCurrentNavigation()?.extras.state?.["response"];

    this.barcode = this.getdata[0].barcode;
    this.name = this.getdata[0].name;
    this.description = this.getdata[0].description;
    this.quantity = this.getdata[0].quantity;
    this.purchase_rate = this.getdata[0].purchase_rate;
    this.sales_rate = this.getdata[0].sales_rate;
    this.size = this.getdata[0].size;
    this.category = this.getdata[0].category;
    this.colors = this.getdata[0].colors;
    this.stock = this.getdata[0].stock;
    this.supplier = this.getdata[0].supplier;
  }


  ngOnInit(): void {
  }


}
