import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Transection } from '../models/transection';

@Injectable({
  providedIn: 'root'
})
export class TransectionService {

  constructor( private http:HttpClient) { }
  url:any;

  showalltransection():Observable<Transection>{
    this.url="http://localhost:8080/showalltransection";
    return this.http.get<Transection>(this.url);
  }
}
