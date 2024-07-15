import { Component, OnInit } from '@angular/core';
import { Admin } from '../models/admin';
import { AdminLoginService } from '../services/admin-login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-registration',
  templateUrl: './admin-registration.component.html',
  styleUrls: ['./admin-registration.component.css'],
})
export class AdminRegistrationComponent implements OnInit {
  constructor(private myservice: AdminLoginService, private router: Router) {}

  ngOnInit(): void {}
  id: any;
  name: any;
  email: any;
  password: any;
  address: any;
  phone: any;
  gender: any;

  alldata: any;

  insert() {
    this.alldata = new Admin(
      this.id,
      this.name,
      this.email,
      this.password,
      this.address,
      this.phone,
      this.gender
    );
    this.myservice.insert(this.alldata).subscribe(() => {});
    alert('Successfully submitted');
    this.router.navigateByUrl('success');

    this.id = 0;
    this.name = '';
    this.email = '';
    this.password = '';
    this.address = '';
    this.phone = '';
    this.gender = '';
  }
}
