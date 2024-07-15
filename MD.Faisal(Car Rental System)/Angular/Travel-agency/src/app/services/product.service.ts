import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { Lunchproduct } from '../models/lunchproduct';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  constructor(private http: HttpClient) {}
  // -------For Show card into Menu--------
  url: any;
  show(): Observable<Lunchproduct> {
    this.url = 'http://localhost:8080/show_lunch';
    return this.http.get<Lunchproduct>(this.url);
  }
// -------- For Show card into show-details---------


productList:any=new BehaviorSubject<any>([]);
  cardItemList: any[] = [];

  addDetailsToCard(p: Lunchproduct) {
    this.cardItemList.push(p);
    // this.productList.next(this.cardItemList);
    alert(this.cardItemList.length);
   
    
  }
  // -------
  getDetailsOfProducts() {
    return this.cardItemList;
  }
 
  // getTotalPrice(){
  //   let grandtotal=0;
  //   this.cardItemList.map((a:any)=>{
  //     grandtotal+=a.total;
  //   })
  // }
// removecartItem(p:any){
// this.cardItemList.map((a:any,index:any)=>{
// if(p.pro_id===a.id){
//   this.cardItemList.splice(index,1)
// }
// })
// }
removeAllitem(){

  this.cardItemList=[]
  this.productList.next(this.cardItemList);
}



  removeItem(p: any) {
    return this.cardItemList.slice().filter(item => item.id !== p.pro_id);
  }
}
