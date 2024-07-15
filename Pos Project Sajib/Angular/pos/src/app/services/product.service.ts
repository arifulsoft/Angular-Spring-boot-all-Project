import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../models/product';
import { Sales } from '../models/sales';
import { Transection } from '../models/transection';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http:HttpClient) { }

  url:any;

  addProduct(s:Product):Observable<Product>{
    this.url="http://localhost:8080/addProducts";
    return this.http.post<Product>(this.url,s);
  }

  // ----------------------- search by barcode ---------------------------


  searchBybarcode(barcode:any):Observable<Product>{
    this.url="http://localhost:8080/searchbybarcode/";
    return this.http.get<Product>(this.url+barcode);
  }

  // ----------------------- show all product ---------------------------


  showallproduct():Observable<Product>{
    this.url="http://localhost:8080/showallproduct";
    return this.http.get<Product>(this.url);
  }
  

  //______________________Save Sales_______________________________

  saveSales(sales:any):Observable<Sales>{
    this.url="http://localhost:8080/saveSales";
    return this.http.post<Sales>(this.url,sales);
  }

  //___________________update sales product stock__________________________________

  updateSalesProductStock(product:any):Observable<Product>{
    this.url="http://localhost:8080/salesProductUpdate";
    return this.http.post<Product>(this.url,product);
  }

  //___________________update sales product__________________________________

  // updateSalesProduct(product:any):Observable<Product>{
  //   this.url="http://localhost:8080/salesProductUpdateown";
  //   return this.http.post<Product>(this.url,product);
  // }

  //transection id------------------------
  getTransectionId():Observable<Transection>{
    this.url="http://localhost:8080/transectionId";
    return this.http.get<Transection>(this.url);
  }

  //Save Transection -------------------------------------------
  
  saveTransection(t:any):Observable<Transection>{
    this.url="http://localhost:8080/saveTransection";
    return this.http.post<Transection>(this.url,t);
  }

  // .......................Show all Transection


}
