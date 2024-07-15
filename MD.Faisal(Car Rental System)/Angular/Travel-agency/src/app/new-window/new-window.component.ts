import { state } from '@angular/animations';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserRegistrationService } from '../services/user-registration.service';
import { User } from '../models/user';

@Component({
  selector: 'app-new-window',
  templateUrl: './new-window.component.html',
  styleUrls: ['./new-window.component.css']
})
export class NewWindowComponent implements OnInit {

  a_number: any;
  name: any;
  gender: any;
  email: any;
  password: any;
  phone: any;
  balance: any;

  data:any;
  
  constructor(private router:Router, private myservice: UserRegistrationService) { 
    this.data=this.router.getCurrentNavigation()?.extras.state?.["response"];
    this.a_number = this.data.a_number;
    this.name =  this.data.name;
    this.gender =  this.data.gender;
    this.email =  this.data.email;
    this.password =  this.data.password;
    this.phone =  this.data.phone;
    this.balance =  this.data.balance;
  }

  ngOnInit(): void {
  }

  delete() {
    this.data = new User(this.a_number, this.name, this.gender, this.email, this.password, this.phone, this.balance);
    this.myservice.delete(this.data).subscribe(() => { });
  
    this.a_number=0;
    this.name="";
    this.gender="";
   this. email="";
   this. password="";
   this. phone=0;
   this. balance=0;
   alert("Deleted Successfully ")
  }
 
  
}
