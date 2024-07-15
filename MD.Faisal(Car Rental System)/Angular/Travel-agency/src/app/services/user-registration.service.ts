import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../models/user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserRegistrationService {

  constructor(private http:HttpClient) { }

  url:any;
  
// ------------------ user table data insert part ---------------
  insert(s:User):Observable<User>{
    this.url="http://localhost:8080/insert";
    return this.http.post<User>(this.url,s);
  }

  // ------------------ show all user data -------------------

  show():Observable<User>{
    this.url="http://localhost:8080/show";
    return this.http.get<User>(this.url);
  }

  // -------------------------- search an user account -------------------------------

  search(x:any):Observable<User>{
    this.url="http://localhost:8080/";
    return this.http.get<User>(this.url+x);
  }

  // ------------------------ update user data --------------------------------
  update(s:User):Observable<User>{
    this.url="http://localhost:8080/update";
    return this.http.put<User>(this.url,s);
  }

    // ------------------------ delete user data --------------------------------
    delete(s:User):Observable<any>{
      this.url="http://localhost:8080/delete/";
      return this.http.delete<any>(this.url+s.a_number);
    }

}
