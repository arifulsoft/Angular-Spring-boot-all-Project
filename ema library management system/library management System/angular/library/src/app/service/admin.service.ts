import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Admin } from '../model/admin';
import { Categorie } from '../model/categorie';
import { User } from '../model/user';
import { Mystery } from '../model/mystery';

@Injectable({
  providedIn: 'root'
})
export class AdminService {
  constructor(private http: HttpClient) { }


  url: any = "http://localhost:8080/";

  // -------------------admin login--------------

  loginById(id: any, password: any): Observable<Admin> {
    this.url = "http://localhost:8080/";
    return this.http.get<Admin>(this.url + id + "/" + password);
  }
  // --------------------show all category-------------------------
  showAllCategorieBooks(): Observable<Categorie> {
    this.url = "http://localhost:8080/showcategory";
    return this.http.get<Categorie>(this.url);
  }

  // --------------------show all mystery books-------------------------
  showAllMysteryBooks(): Observable<Mystery> {
    this.url = "http://localhost:8080/showmysterybooks";
    return this.http.get<Mystery>(this.url);
  }

// ------------------------insert new user----------------------
  insert(s: User): Observable<User> {
    this.url = "http://localhost:8080/insert";
    return this.http.post<User>(this.url, s);
  }

  // ------------------- get book by name -------------------------searchcategory

  searckbookbyname(bname: any): Observable<Mystery> {
    this.url = "http://localhost:8080/searchbybookname/";
    return this.http.get<Mystery>(this.url + bname);
  }

  // ----------------------insert new book data-----------------------------
  insertnewbook(s: User): Observable<Mystery> {
    this.url = "http://localhost:8080/insertnewbook";
    return this.http.post<Mystery>(this.url, s);
  }



  // ------------------- get all related books -------------------------

  searchcategory(name: any): Observable<Categorie> {
    this.url = "http://localhost:8080/searchcategory/";
    return this.http.get<Categorie>(this.url + name);
  }

  // ---------------------search user by id----------------------------
  searchById(id: any): Observable<User> {
    this.url = "http://localhost:8080/";
    return this.http.get<User>(this.url + id);
  }
// ------------------------update user---------------------------------------
  update(s: User): Observable<User> {
    this.url = "http://localhost:8080/update";
    return this.http.put<User>(this.url, s);
  }



  //--------------------------- getbook by number-----------------------------
  getBookByNumber(number: any): Observable<Mystery> {
    this.url = "http://localhost:8080/getbookbynumber/"
    return this.http.get<Mystery>(this.url + number);
  }

  borrowedBooksList: any = [];


  // -------------------------listed borrowed book -------------------
  borrowBookList(book: Mystery) {
    this.borrowedBooksList.push();
  }

  //----------------------getting borrowed book list-------------------- 
  getBorrowedBookList() {
    return this.borrowedBooksList;
  }

  deleteBorrowed(b: Mystery) {
    // const items = ['item 1', 'item 2', 'item 3'];
    // const filteredItems = this.borrowedBooksList.slice().filter( (item:Mystery) => item.number !== b.number);
    this.borrowedBooksList.pop(b);
  }


  // ---------------------------saveBorrowedBookList-------------------------------

  saveBorrowedBookList(b:Mystery):Observable<Mystery>{
    this.url = "http://localhost:8080/saveborrowedBookList"
    alert(this.url)
    return this.http.post<Mystery>(this.url,b);

  }

  // ------------------------------showalluserdata-------------------------

  showalluserdata():Observable<User>{
    this.url="http://localhost:8080/show";
    return this.http.get<User>(this.url);
  }

// ------------------- get user id--------------

getuserId(id: any): Observable<Admin> {
  this.url = "http://localhost:8080/";
  return this.http.get<Admin>(this.url + id);
}

// ---------------------update mystery---------------------
updatemystery(s: Mystery): Observable<Mystery> {
  this.url = "http://localhost:8080/updatemystery";
  return this.http.put<Mystery>(this.url, s);
}
// ---------------------update mystery for return book---------------------
updatemysterybook(s: any): Observable<Mystery> {
  this.url = "http://localhost:8080/updatemysterybooks/";
  return this.http.get<Mystery>(this.url+ s);
}


}








