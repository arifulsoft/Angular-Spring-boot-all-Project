import { Injectable } from '@angular/core';
import { Employee } from '../models/employee';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http:HttpClient) { }

  url:any;

  employee(s:Employee):Observable<Employee>{
    this.url="http://localhost:8080/insert";
    return this.http.post<Employee>(this.url,s);
  }

  login(email:any,password:any):Observable<Employee>{
    this.url="http://localhost:8080/";
    return this.http.get<Employee>(this.url+email+"/"+password);
  }

    // ----------------------- show all Employee ---------------------------


    showallemployee():Observable<Employee>{
      this.url="http://localhost:8080/showallemployee";
      return this.http.get<Employee>(this.url);
    }

}
