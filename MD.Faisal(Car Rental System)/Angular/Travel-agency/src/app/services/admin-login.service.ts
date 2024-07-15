import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Admin } from '../models/admin';
import { HttpClient } from '@angular/common/http';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root',
})
export class AdminLoginService {
  constructor(private http: HttpClient) {}

  url: any;

  // ------------------- admin login ---------------------------

  login(id: any, password: any): Observable<Admin> {
    this.url = 'http://localhost:8080/';
    return this.http.get<Admin>(this.url + id + '/' + password);
  }

  // ----------------------- show admin data -----------------------

  showAdmin(): Observable<Admin> {
    this.url = 'http://localhost:8080/show_admin';
    return this.http.get<Admin>(this.url);
  }

  insert(s: Admin): Observable<Admin> {
    this.url = "http://localhost:8080/insert_admin";
    return this.http.post<Admin>(this.url, s);
  }
}
