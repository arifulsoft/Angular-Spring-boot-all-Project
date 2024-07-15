import { Component, OnInit } from '@angular/core';
import { UserRegistrationService } from '../services/user-registration.service';
import { User } from '../models/user';

@Component({
  selector: 'app-account-update',
  templateUrl: './account-update.component.html',
  styleUrls: ['./account-update.component.css']
})
export class AccountUpdateComponent implements OnInit {

  constructor(private myservice: UserRegistrationService) {
  }

  a_number: any;
  name: any;
  gender: any;
  email: any;
  password: any;
  phone: any;
  balance: any;

  getData: any;

  ngOnInit(): void {

  }
  
  // -------------------- search account -------------------------------

  search() {
    this.myservice.search(this.a_number).subscribe((x) => {
      this.getData = x;

      this.a_number = this.getData.a_number;
      this.name = this.getData.name;
      this.gender = this.getData.gender;
      this.email = this.getData.email;
      this.password = this.getData.password;
      this.phone = this.getData.phone;
      this.balance = this.getData.balance;

    });

  }


  // ------------------------------ update account //  variable golo oi upor ya---------------------------------

  update() {
    this.getData = new User(this.a_number, this.name, this.gender, this.email, this.password, this.phone, this.balance);
    this.myservice.update(this.getData).subscribe(() => { });
    alert("Successfully Updated");

   this. a_number=0;
   this. name="";
  this.  gender="";
   this. email="";
   this. password="";
   this. phone=0;
   this. balance=0;
  }

}
