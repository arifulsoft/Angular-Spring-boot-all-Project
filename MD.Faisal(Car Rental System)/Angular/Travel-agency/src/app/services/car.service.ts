import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { CarTransactionTable } from '../models/car-transaction-table';
import { CarTable } from '../models/car-table';

import { Carbooking } from '../models/carbooking';
import { BookingApprovalTable } from '../models/booking-approval-table';

@Injectable({
  providedIn: 'root',
})
export class CarService {
  constructor(private http: HttpClient) {}
  // --------For search cars by place----
  url: any;
  search(from: any, to: any): Observable<CarTransactionTable> {
    this.url = 'http://localhost:8080/login/';
    return this.http.get<CarTransactionTable>(this.url + from + '/' + to);
  }
  // --------For show all cars-------
  show(): Observable<CarTransactionTable> {
    this.url = 'http://localhost:8080/show_cars';
    return this.http.get<CarTransactionTable>(this.url);
  }

  carDetails: any[] = [];

  addDetailsToCar(i: CarTable) {
    this.carDetails.push(i);
    alert(this.carDetails.length);
  }

  getDetailsofCar() {
    return this.carDetails;
  }
  tempdata: any[] = [];
  removeItem(p: any) {
    // this.tempdata=this.carDetails.splice().filter(item => item.serial_no !== p.serial_no);
    // this.carDetails=this.tempdata;
    // return this.tempdata;
    this.carDetails = this.carDetails.filter((x) => {
      x.serial_no !== p.serial_no;
    });
  }

  insertTransactionTable(s: any): Observable<CarTransactionTable> {
    this.url = 'http://localhost:8080/cartransection';
    return this.http.post<CarTransactionTable>(this.url, s);
  }

  saveIntoCarBookingTable(s: Carbooking): Observable<Carbooking> {
    this.url = 'http://localhost:8080/cartransection';
    return this.http.post<Carbooking>(this.url, s);
  }

  showCarBookingTable(): Observable<Carbooking> {
    this.url = 'http://localhost:8080/showBookingTable';
    return this.http.get<Carbooking>(this.url);
  }
  getRequestById(x: any): Observable<Carbooking> {
    this.url = 'http://localhost:8080/getByNid/';
    return this.http.get<Carbooking>(this.url + x);
  }

  insertApproval(s: BookingApprovalTable): Observable<BookingApprovalTable> {
    this.url = "http://localhost:8080/insertapproval";
    return this.http.post<BookingApprovalTable>(this.url, s);
  }

  deletecarbooking(nid: any): Observable<Carbooking> {
    this.url = 'http://localhost:8080/deletecarbooking/';
    return this.http.delete<Carbooking>(this.url+nid);
  }

  // ---------------------- get payment search by nid -----------------
  searchRequestById(nid: any): Observable<BookingApprovalTable> {
    this.url = 'http://localhost:8080/searchByNid/';
    return this.http.get<BookingApprovalTable>(this.url + nid);
  }

  showApprovalTable():Observable<BookingApprovalTable>{
    this.url = 'http://localhost:8080/showApprovalTable';
    return this.http.get<BookingApprovalTable>(this.url);
  }

}
